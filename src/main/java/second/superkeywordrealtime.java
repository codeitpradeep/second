package second;

/*
Let's see the real use of super keyword.
Here, Emp class inherits Person class so all the properties
of Person will be inherited to Emp by default.
To initialize all the property, we are using parent class 
constructor from child class. In such way, 
we are reusing the parent class constructor.
 */
class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Empdetails extends Person {
    double salary;

    Empdetails(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
        // TODO Auto-generated constructor stub
    }

    void showdetails() {
        System.out.println("Delatis id -" + id);
        System.out.println("Delatis name -" + name);
        System.out.println("Delatis salary -" + salary);
    }

}

public class superkeywordrealtime {
    public static void main(String[] args) {
        Empdetails empd = new Empdetails(101, "Pradeep", 4500.00);
        Empdetails empd2 = new Empdetails(102, "Pradeep", 4500.00);
        Empdetails empd3 = new Empdetails(103, "Pradeep", 4500.00);
        Empdetails empd4 = new Empdetails(104, "Pradeep", 4500.00);
        empd.showdetails();
        empd2.showdetails();
        empd3.showdetails();
        empd4.showdetails();

    }
}
//
//Delatis id -101
//Delatis name -Pradeep
//Delatis salary -4500.0
//Delatis id -102
//Delatis name -Pradeep
//Delatis salary -4500.0
//Delatis id -103
//Delatis name -Pradeep
//Delatis salary -4500.0
//Delatis id -104
//Delatis name -Pradeep
//Delatis salary -4500.0
