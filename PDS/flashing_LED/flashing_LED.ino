// Programa : Pisque um LED
// Autor : MakerHero
  
void setup()
{
  //Define a porta do led como saida
  pinMode(13, OUTPUT);
}
  
void loop()
{
  //Acende o led
  digitalWrite(13, HIGH);
    
  //Aguarda intervalo de tempo em milissegundos
  delay(500);
    
  //Apaga o led
  digitalWrite(13, LOW);
    
  //Aguarda intervalo de tempo em milissegundos
  delay(500);
}