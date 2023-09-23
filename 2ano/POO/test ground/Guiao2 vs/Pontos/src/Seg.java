public class Seg {
    private Pontos p1, p2;
    
    Seg(double x1, double y1,double x2, double y2) {
        this.p1 = new Pontos(x1,y1);
        this.p2 = new Pontos(x2,y2);
    }
   public double comprimento()
   {
        return Math.sqrt(Math.pow(this.p1.getX()-this.p2.getX(),2) + Math.pow(this.p1.getY()-this.p2.getY(),2));
    }

   public double declive() {
   return (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
   }    

   public String Up_or_Downn() {
   if(declive()>0){
    return ("up");
   }
    else {
        return ("down");
    }
   
}
    public void desloca(double xx,double yy) {
       this.p1.setX(this.p1.getX()+xx);
       this.p2.setX(this.p2.getX()+xx);
       this.p1.setY(this.p1.getY()+yy);
       this.p2.setY(this.p2.getY()+yy);
     
    }

    public double pri(){

        return declive()*Math.PI;

    }


}
