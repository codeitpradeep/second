package Abrstclsspgm;

public class Rectangledraw extends Drawart{

   public Rectangledraw(int i, int j) {
      super(i, j);
      
   }
   
   @Override
   public void getdraw() {
      System.out.printf("Rectangledraw Area "
      		+ "=%d\n",length*breath);
   }

}
/*
Super class ( Drawart ) act as abstract , when super class contain constructor (child class - 'class Rectangledraw' ) must create subclass constructor ,
Automatically Abstract method to be overridden in subclass ( public void getdraw() )
Here the magic we initialize subclass constructor , then we call super(i, j); to assign constructor in superclass .
We will get value for ("Rectangledraw Area =%d\n",length*breath); - from common parent class called as Abstract
*/