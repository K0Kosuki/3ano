// LIBRARIES //////////////////////////////////////////////////////////////////
#include "MPU9250.h"
#include <TimerOne.h>

// VARIABLES AND OBJECTS DEFINITION ///////////////////////////////////////////
MPU9250 mpu;
bool newData = false; // Flag to indicate new data is available

//Filter Information - sequence already flipped
float x = 0;
float y = 0;
float x_prev = 0;
float y_prev = 0;

// SETUP //////////////////////////////////////////////////////////////////////
void setup() {
  Serial.begin(115200); //Serial communication to print information
  Wire.begin();         //I2C communication starts
  delay(2000);          //Delay of 2 seconds

  // Check the sensor connections
  if (!mpu.setup(0x68)) {  // change to your own address
    while (1) {
      Serial.println("MPU connection failed. Please check your connection with `connection_check` example.");
      delay(5000);
    }
  }
    
  // Start the timer to read data every 10ms [ 1 second = 1000000 microseconds]
  Timer1.initialize(10000);
  Timer1.attachInterrupt(readMPUData);
}

// LOOP ///////////////////////////////////////////////////////////////////////
void loop() {
  
  if (newData) {
    // Data is available, print it
    newData = false; // Reset the flag
    printData();
  }
  
}

// ISR FUNCTION ///////////////////////////////////////////////////////////////
void readMPUData(){
  newData = true; // Set the flag to indicate new data is available
}


// PRINT DATA TO SERIAL MONITOR OR PLOTTER ////////////////////////////////////
void printData() {
  if (mpu.update()) {
    //Obtain sensor data1
    float ax = mpu.getAccX(); float ay = mpu.getAccY(); float az = mpu.getAccZ();
    x = sqrt(ax*ax + ay*ay + az*az);
    Serial.print(x, 5); Serial.print(',');

    y = x - x_prev + 0.99995*y_prev;

    Serial.println(y, 5);

    y_prev = y;
    x_prev = x;
      
  }
}
