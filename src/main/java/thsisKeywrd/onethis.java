package thsisKeywrd;

class thseg {
  public String a, b;

  public thseg(String b) {
    this.b = b;
  }
  public String name() {
    return b;
  }

}

public class onethis {

  public static void main(String[] args) {
    thseg t = new thseg("hi");
    System.out.println(t.name());
  }

}
//hi
