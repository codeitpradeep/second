package second;
//Method Overloading. If a class has multiple methods having same name but different in parameters,
  //it is known as Method Overloading.

//If we have to perform only one operation, having same name of the methods increases the readability of the program.

//Suppose you have to perform addition of the given numbers but there can be any number of arguments, 
  //if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

class Gafaddress{
  void addaddress(int pin,String city,String state,String cntry){
    System.out.println("Here address one");
  }
  void addaddress(String city,int pin,String state,String cntry){
    System.out.println("Here address two");
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Gafaddress gaf = new Gafaddress();
    gaf.addaddress(111,"newCity","newState","new country");
    gaf.addaddress("newCity",111,"newState","new country");
  }
}
/*
Here address one
Here address two
 */
