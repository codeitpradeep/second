package mycodejavaegm;

// Integer Pattern 
public class pgm025 {

  public static void main(String[] args) {
    System.out.println("Pattern ---- 1");
    int num = 5 ;

    for(int m=1;m<=num;m++){
      for(int n=1;n<=m;n++){
        System.out.print("*");
      }
      System.out.println("");
    }
    
    System.out.println("Pattern ---- 2");
    int num2 = 5 ;

    for(int m=1;m<=num2;m++){
      for(int s=num-m;s>=1;s--){  // 4 
        System.out.print(" ");
      }
      for(int n=1;n<=m;n++){
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    System.out.println("Pattern ---- 3");
    for(int m=5;m>=1;m--){ // 5 , 4 ... 1
      for(int n=m;n>=1;n--){
        System.out.print("* ");
      }
      System.out.println("");
    }
    
    
    System.out.println("Pattern ---- 4");
    for(int m=1;m<=5;m++){
      for(int a=1;a<m;a++){
        System.out.print(" ");
      }
      
      for(int n=5;n>=m;n--){
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    System.out.println("Pattern ---- 5");
    for(int m=1;m<=5;m++){
      for(int a=m;a<5;a++){
        System.out.print(" ");
      }
      for(int n=1;n<=(m * 2)-1 ; n++){
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    System.out.println("Pattern ---- 6");
    for(int m=5;m>=1;m--){ //5 4 3 ... 1
      for(int a=m;a<5;a++){ // 1 2 3 4
        System.out.print(" ");
      }
      for(int n=1;n<=(m*2)-1;n++){ // 5*2 = 
      //10-1 = 9
        System.out.print("*");
      }
      System.out.println("");
    }
    
    System.out.println("Pattern ---- 7");
    for(int m=1;m<=5;m++){ // 1 2 3..5
      for(int n=1;n<=m;n++){ // 1 2 3 4 5
        System.out.print(n+"");
      }  
      System.out.println("");
    }
    for(int m=4;m>=1;m--){ // 4 3 2 1
      for(int n=1;n<=m;n++){ // 4 3 2 1
        System.out.print(n+"");
      }
      System.out.println("");
    }
  }

}
/*
Pattern ---- 1
*
**
***
****
*****
Pattern ---- 2
    *
   **
  ***
 ****
*****
Pattern ---- 3
* * * * * 
* * * * 
* * * 
* * 
* 
Pattern ---- 4
*****
 ****
  ***
   **
    *
Pattern ---- 5
    *
   ***
  *****
 *******
*********
Pattern ---- 6
*********
 *******
  *****
   ***
    *
Pattern ---- 7
1
12
123
1234
12345
1234
123
12
1

 */

