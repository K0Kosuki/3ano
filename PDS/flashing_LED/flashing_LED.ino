int led1 = 13;
int led2 = 12; 

void setup() {
pinMode(led1,OUTPUT);
pinMode(led2,OUTPUT);
}
int
void loop() {
  // put your main code here, to run repeatedly:
digitalWrite(led1,HIGH);
delay(100);
digitalWrite(led2,HIGH);
delay(100);
digitalWrite(led1,LOW);
delay(100);
digitalWrite(led2,LOW);
delay(100);
}
