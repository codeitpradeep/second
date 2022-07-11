package Abrstclsspgm;

public class Areainvokeabst {

   public static void main(String[] args) {

      Drawart dr = new Squaredraw(2, 2);
      dr.getdraw();

      Drawart dr2 = new Rectangledraw(2, 4);
      dr2.getdraw();

   }

}
/*
First constructor
Squaredraw class Area =4 
First constructor
Rectangledraw Area =8
 */

/*
 * Drawart dr = new Squaredraw(2,2); - Directly i will call Object class
 * constructor then move to first abstract constructor
 * 
 * 
 * 
 */

/*
 * First constructor Squaredraw class Area =4 First constructor Rectangledraw
 * Area =8
 */