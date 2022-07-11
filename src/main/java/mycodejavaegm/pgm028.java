package mycodejavaegm;

import java.util.Arrays;

//String - two strings are the anagram (Eg - Barg Grab)
public class pgm028 {

  public static void main(String[] args) {
    String a = "Barg";
    String b = "Grab";
    boolean flag=false;
    
    a=a.toLowerCase();
    b=b.toLowerCase();
    
    boolean ans = a.length() == b.length() ? true:false ;
    //flag = ans;
    if(ans) {
      
      char[] one= a.toCharArray();
      char[] two= b.toCharArray();
      Arrays.sort(one);
      Arrays.sort(two);
      
      flag = Arrays.equals(one, two)? true : false;
      System.out.println(one);
      System.out.println(two);
    }
    if(flag) {
      System.out.println("anagram");
    }else {
      System.out.println("Not anagram");
    }
    
  }

}
/*
abgr
abgr
anagram
 */

