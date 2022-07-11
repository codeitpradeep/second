package second;
//Create Abstract Eg - 

abstract class School {
   School() {
      System.out.println("School");
   }

   abstract void studentclass();
}

class classone extends School {
   void studentclass() {
      System.out.println("Class one");
   }
}

class classtwo extends School {
   void studentclass() {
      // TODO Auto-generated method stub
      System.out.println("Class two");
   }

}

public class abstratpgmwithconstrtr {
   public static void main(String[] args) {
      classone c1 = new classone();
      classtwo c2 = new classtwo();

      c1.studentclass();
      c2.studentclass();
   }
}
/*
School
School
Class one
Class two
 */
