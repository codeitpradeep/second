package interfacepgm;

interface aminals {
  public static int a = 100;

  void add();

//  void sub();

  default void sub() {
    System.out.println("Here");
  }

}

class doghome {
  void Aa() {
    // a=100;
  }
}

class dogs implements aminals {

  @Override
  public void add() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void sub() {

    System.out.println("Need to be FRR");
  }
}

class cats implements aminals {

  @Override
  public void add() {
    // TODO Auto-generated method stub

  }

}

public class Interfaceprat {

  public static void main(String[] args) {
    
    dogs d = new dogs();
    d.sub();

    cats c = new cats();
    c.sub();

  }
}
