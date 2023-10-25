void setup() {
  // put your setup code here, to run once:
  pinMode(13, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if (Serial.available()){
    char data_rcvd = Serial.read();

    if (data_rcvd == 'a'){
      digitalWrite(13, HIGH);
      Serial.println("LED ON");
    }
    
    if (data_rcvd == 'b'){
      digitalWrite(13, LOW);
      Serial.println("LED OFF");
    }
    
  }

//  digitalWrite(13, HIGH);
//  delay(500);
//  digitalWrite(13, LOW);
//  delay(500);
}
