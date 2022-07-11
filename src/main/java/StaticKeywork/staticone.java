package StaticKeywork;

/**
 * Use a static variable when all objects of a class must use the same copy of
 * the variable static is a non-access modifier in Java which is applicable for
 * the following:
 * 
 * blocks variables methods nested classes
 * 
 * adding static before methods and variables make them class methods and class
 * variables respectively, instead of instance methods and instance variables.
 * 
 * The static keyword in Java is used for memory management mainly.
 * 
 * . Sometimes a method performs a task that does not depend on an object. Such
 * a method applies to the class in which it’s declared as a whole and is known
 * as a static method or a class method.
 * 
 * Eg- Math.sqrt(900.0) - here Math is class contain public static double
 * sqrt(double a) So,To declare a method as static, place the keyword static
 * before the return type in the method’s declaration. For any class imported
 * into your program, you can call the class’s static methods by specifying the
 * name of the class in which the method is declared, followed by a dot (.) and
 * the method name, as in
 * 
 * 
 * variables = The static variable can be used to refer to the common property
 * of all objects (which is not unique for each object), for example, the
 * company name of employees, college name of students, etc. The static variable
 * gets memory only once in the class area at the time of class loading.
 * 
 */

class Myclg {
  String name;
  static String dept = "CSE";

  public Myclg(String name, String d) {
    this.name = name;
  }

  void showname() {
    System.out.printf("%s dept is %s \n", name, dept);
  }

}

public class staticone {

  public static void main(String[] args) {

    Myclg clg = new Myclg("Pradeep", "");
    clg.showname();

    System.out.printf("dept is %s\n", Myclg.dept);
    // public static double sqrt(double a) internal call
    System.out.printf("MATH is %f", Math.sqrt(900.0));
  }
}
/*
Pradeep dept is CSE 
dept is CSE
MATH is 30.000000
 */
