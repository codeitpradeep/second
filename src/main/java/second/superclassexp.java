package second;
//Super class method 

/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
 */

/*
#super keywork to get variable from parent class(super class)  
 */
class Axis {
    String bank = "Axis";
    void p() {
        
    }
    void getbankname() {
        System.out.println("Display -" + bank);
        //System.out.println("From  " + super.bank);
    }
    
}

class Account extends Axis {
    String bank = "Axis-india";

    void getbankname() {
        System.out.println("Display sa-" + bank);
        //System.out.println("From  " + super.bank);
    }
}

public class superclassexp {

    public static void main(String[] args) {

    	Axis acc = new Account();
        acc.getbankname();
    	
    
    }

}
/*
Display -Axis-india
From  Axis
 */
