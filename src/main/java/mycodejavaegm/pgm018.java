package mycodejavaegm;

//Array - Print items by position ODD , EVEN 
public class pgm018 {

  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7};
    System.out.println("Print Even Position");
    for(int i=1;i < a.length ; i=i+2){
      System.out.println("= "+a[i]);
    }
    System.out.println("Print ODD Position");
    for(int i=0;i < a.length ; i=i+2){
      System.out.println("= "+a[i]);
    }
  }

}
/*
Print Even Position
= 2
= 4
= 6
Print ODD Position
= 1
= 3
= 5
= 7
 */