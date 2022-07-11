package StaticKeywork;

class Onlineclassstd {

  String name, dept;
  int stdno;

  static String day;
  static int countstd = 0;

  static {
    day = "Dayone";
//    Static block will call first after main() method.
//    whenever the static block create first memory'
//    will allocated to static block
    System.out.println(day);
  }

  Onlineclassstd(String name, String dept) {
    this.name = name;
    this.dept = dept;
    this.stdno = getstdcount();
  }

  static int getstdcount() {
    countstd++;
    return countstd;
  }

  public void getstdinfo() {

    System.out.println("//" + this.stdno 
    		+ " " + this.name
    		+ " " + this.dept + " ");
  }
}

public class staticall {

  public static void main(String[] args) {
    Onlineclassstd std1 = new Onlineclassstd("Pradeep", "CSE");
    Onlineclassstd std2 = new Onlineclassstd("Vinoth", "CSE");
    System.out.println("Online class");

    std1.getstdinfo();// 1 Pradeep CSE
    std2.getstdinfo();// 2 Vinoth CSE
    // static method - its class as class method , when this method calls .
    // inside static ( contain static variable ) here we can change or modify static
    // variable.
    System.out.println("Use of static method " 
    + Onlineclassstd.getstdcount());// Use of static method 3
  }

}
/*
 Online class
//1 Pradeep CSE 
//2 Vinoth CSE 
Use of static method 3
*/