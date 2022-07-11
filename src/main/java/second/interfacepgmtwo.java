package second;

//create a interface and abstract method .
interface Polygon {
   void getArea();

   // create default method , call this 
   //method as default
   default void getSides() {
      System.out.println("All sides");
   }
}

//implements the Polygon and automatically
//abstract method to be define.
class Rectangle implements Polygon {
   // create and do any action indide as void
   public void getArea() {
      int area = 10 * 14;
      System.out.println("Rectangle area is - " + area);
   }

   // Here the  overridden method
   public void getSides() {
      System.out.println("Rectangle sides");
   }
}

//Same create implements Polygon
class Square implements Polygon {
   public void getArea() {
      int area = 10 * 10;
      System.out.println("Square area is - " + area);
   }
}

public class interfacepgmtwo {

   public static void main(String[] args) {
      Polygon rect = new Rectangle();
      rect.getArea(); // goes to Rectangle
      rect.getSides(); // calls inside Rectangle

      Square sq = new Square();
      sq.getArea(); // goes to Square
      sq.getSides(); // calls default inside interface Polygon
   }

}
/*
Rectangle area is - 140
Rectangle sides
Square area is - 100
All sides
 */
