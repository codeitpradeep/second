package mycodejavaegm;

//String - Find total number of Character
public class pgm026 {

  public static void main(String[] args) {
    String s = "Hai im pradeep";
    for(int a=0;a<s.length();a++) {
      if(s.charAt(a) != ' ') {
      System.out.print(s.charAt(a)+" ");
      }
    }
    
  }

}
/*
H a i i m p r a d e e p
 */

