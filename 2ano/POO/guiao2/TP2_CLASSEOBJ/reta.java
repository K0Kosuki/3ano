public class reta{

public static void main(String[] args) {
Pontos U = new Pontos(2, 4);
Pontos I = new Pontos(5, 4);
Seg O = new Seg(2,6,5,1);
System.out.println("comprimento="+O.comprimento()); 
System.out.println("declive="+O.declive());
System.out.println("sobe ou desce: "+O.Up_or_Downn());

System.out.println("primetro do circu:" +O.pri());


}


}