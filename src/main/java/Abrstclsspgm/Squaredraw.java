package Abrstclsspgm;

public class Squaredraw extends Drawart {

   public Squaredraw(int i, int j) {
      super(i, j);

   }

   @Override
   public void getdraw() {
      // TODO Auto-generated method stub
      System.out.printf("Squaredraw class " 
      + "Area =%d \n", length * breath);
   }

}

/*
 * Super class ( Drawart ) act as abstract ,Abstract method to be overridden in
 * subclass ( public void getdraw() ) - common method We will get value for
 * ("Squaredraw class Area =%d\n",length*breath); - from common parent class
 * called as Abstract
 */