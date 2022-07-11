package mycodejavaegm;

// Array Print descending order in array int , First 3 smaller number
public class pgm022 {

  public static void main(String[] args) {
    int a[] = {5,3,7,2,8,1};
    int temp=0;
    for(int n=0;n < a.length; n++ ){
      for(int m=n+1; m < a.length; m++){
        System.out.println("\nBefore Swap "+a[n]+" < "+a[m]);
        if(a[n]<a[m]){
          temp=a[n];
          a[n]=a[m];
          a[m]=temp;
          System.out.println("Swap "+a[n]+" - "+a[m]);
          for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
          }
        }
      }
    }
    System.out.print("\n");
    System.out.print("\n");
    for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
    }
    
    System.out.println("\nFirst smallest - "+a[a.length-1]);
    System.out.println("\nSecond smallest - "+a[a.length-2]);
    System.out.println("\nThird smallest - "+a[a.length-3]);
  }

}
/*
Before Swap 5 < 3
Before Swap 5 < 7
Swap 7 - 5
7 3 5 2 8 1 
Before Swap 7 < 2

Before Swap 7 < 8
Swap 8 - 7
8 3 5 2 7 1 
Before Swap 8 < 1

Before Swap 3 < 5
Swap 5 - 3
8 5 3 2 7 1 
Before Swap 5 < 2

Before Swap 5 < 7
Swap 7 - 5
8 7 3 2 5 1 
Before Swap 7 < 1

Before Swap 3 < 2

Before Swap 3 < 5
Swap 5 - 3
8 7 5 2 3 1 
Before Swap 5 < 1

Before Swap 2 < 3
Swap 3 - 2
8 7 5 3 2 1 
Before Swap 3 < 1

Before Swap 2 < 1

8 7 5 3 2 1 
First smallest - 1
Second smallest - 2
Third smallest - 3
 */

