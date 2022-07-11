package mycodejavaegm;

// Array Print ascending order in array int , first 3 largest
public class pgm021 {

 public static void main(String[] args) {
  int a[] = {5,3,7,2,8,1};
  int temp=0;
  for(int n=0;n < a.length; n++ ){
   for(int m=n+1; m < a.length; m++){
    System.out.println("\nBefore Swap "+a[n]+" > "+a[m]);
    if(a[n]>a[m]){
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
  System.out.println("");
  System.out.println("First Larger -"+a[a.length-1]);
  System.out.println("Second Larger -"+a[a.length-2]);
  System.out.println("Third Larger -"+a[a.length-3]);
 }

}
/*

Before Swap 5 > 3
Swap 3 - 5
3 5 7 2 8 1 
Before Swap 3 > 7

Before Swap 3 > 2
Swap 2 - 3
2 5 7 3 8 1 
Before Swap 2 > 8

Before Swap 2 > 1
Swap 1 - 2
1 5 7 3 8 2 
Before Swap 5 > 7

Before Swap 5 > 3
Swap 3 - 5
1 3 7 5 8 2 
Before Swap 3 > 8

Before Swap 3 > 2
Swap 2 - 3
1 2 7 5 8 3 
Before Swap 7 > 5
Swap 5 - 7
1 2 5 7 8 3 
Before Swap 5 > 8

Before Swap 5 > 3
Swap 3 - 5
1 2 3 7 8 5 
Before Swap 7 > 8

Before Swap 7 > 5
Swap 5 - 7
1 2 3 5 8 7 
Before Swap 8 > 7
Swap 7 - 8
1 2 3 5 7 8 

1 2 3 5 7 8 

First Larger -8
Second Larger -7
Third Larger -5
 */

