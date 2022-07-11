package mycodejavaegm;

//String - to find AEIOU  total number of vowels and consonants in a string
public class pgm027 {

  public static void main(String[] args) {
    String s = "Hi , im pradeep ! as SE";
    s.toLowerCase();
    String[] sp = s.split("\\s");
    //System.out.println(sp[0]); - Hi
    for(String a: sp) {
      if(a.contains("a") || a.contains("e")) {
        System.out.println(a);
      }else if(a.contains("i") || a.contains("o") 
          || a.contains("u")) {
        System.out.println(a);
      }
    }
  }

}
/*
Hi
im
pradeep
as
 */

