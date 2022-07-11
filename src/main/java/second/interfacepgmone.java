package second;
// interface 

/*
Deeper understanding - Interface similar to class , contain contract bases . 
It contain Static and abstract methods inside interface .
Helps to achieve abstraction in Java.
Any number of classes can implement an interface. Also, one class can implement 
any number of interfaces  
Interfaces are also used to achieve multiple inheritance in Java.
 */

// create interface (Address) as class .
// create abstract method inside interface (getpincode())
interface Address {
   int ss = 1000;
   String addre = "India";

   void getpincode(int pincode, String country);

   static void adds(String addre) {
      System.out.print(addre);
   }

   default int addnum(int a, int b) {
      return a + b;
   }
}

class newadds {
   public int addnum(int a, int b) {

      return a * b;
   }
}

// create Areaone class , here we use 'implements' 
//to get interface property .
class Areaone extends newadds implements Address {
   public int a;
   public String b;

   // Here ,after implements write method (getpincode)
   public void getpincode(int pincode, String country) {
      // TODO Auto-generated method stub
      a = pincode;
      b = country;
      System.out.printf("We have %d - %s\n", a, b);
      System.out.printf("Interface have - %d %d"
            , ss, addnum(5, 8));
   }
}

public class interfacepgmone {

   public static void main(String[] args) {
      // create object and get method
      Address a1 = new Areaone();
      a1.getpincode(641606, "Tiruppur");
   }

}

/*
We have 641606 - Tiruppur
Interface have - 1000 40
 */