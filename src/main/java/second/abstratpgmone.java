
package second;
// Deeper Explain of abstract class -

/* Generally abstract class hiding sometime from outside world , 
 * Eg - Car is an abstract have speed, gear , break internally applied 
 * and common to all brands .User no need to see all implementation inside car , 
 * he just drive and apply break .
 * 
 * Deeper Understanding  - By specifying 'abstract method' -
 * need to override by all subclass(child class) from a common super class called abstract class
 * abstract class - contain concrete method -with or without parameter 
 * But 'abstract void method();' should not contain abstract 
 * Non-concrete method normal method can be added inside abstract class 
 */

//Create Abstract class
// We use Animalhere(Animalhere) act as parent class 'abstract'
// Inside abstract class we have 'abstract void makesound();' method
// here 'Dog' , 'cat' both have common behavior makesound() 
// 'Dog' , 'cat' extends Animalhere(Animalhere) act as parent class 'abstract'
abstract class Animalhere {
  abstract void makesound();

  void eat() {
    System.out.println("Non-Abstract method"
    		+ " inside Abstract class");
  }
}

class Dog extends Animalhere {

  public void makesound() {
    System.out.println("Implementing"
    		+ " makesound(Abstract method)");
  }

}

class cat extends Animalhere {

  public void makesound() {
    System.out.println("Implementing "
    		+ "makesound(Abstract method)");
  }

}

public class abstratpgmone {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Dog dg = new Dog();
    dg.eat();
    dg.makesound();

    cat cat = new cat();
    cat.eat();
    cat.makesound();
  }

}

/*
Non-Abstract method inside Abstract class
Implementing makesound(Abstract method)
Non-Abstract method inside Abstract class
Implementing makesound(Abstract method)
 */