package mycodejavaegm;

//Array Print Largest number in int array
public class pgm019 {

  public static void main(String[] args) {
    int a[] = {23,44,75,2,28,99,7,12};
    int max = a[0];
    
    
    for(int i=0; i < a.length ; i++){
      System.out.println("Step "+i+" "+a[i]+" > "+max);
      if(a[i] > max ){
        max = a[i];
      }
    }
    System.out.println("\n Max no - "+ max);
  }

}
/*
Step 0 23 > 23
Step 1 44 > 23
Step 2 75 > 44
Step 3 2 > 75
Step 4 28 > 75
Step 5 99 > 75
Step 6 7 > 99
Step 7 12 > 99

 Max no - 99
 */