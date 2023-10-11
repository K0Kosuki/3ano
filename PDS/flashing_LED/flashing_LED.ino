
void setup() {
pinMode(13,OUTPUT);
Serial.begin(9600);
}
int
void loop() {
  // put your main code here, to run repeatedly:

  if(Serial.available()){
    char data_rcvd = Serial_read();
    if(data_rcvd = 'a'){
      digitalWrite(13,HIGH);
      
    }
  if(data_rcvd = 'b'){
    digitalWrite(13,LOW);
  }

  }
} 
