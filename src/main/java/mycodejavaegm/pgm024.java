package mycodejavaegm;

import java.util.Arrays;

// Array , Remove Elements and its occurrences
public class pgm024 {

  public static int[] removeElements(int[] arr, int key)
    {
          // Move all other elements to beginning 
          int index = 0;
          for (int i=0; i<arr.length; i++){
             if (arr[i] != key){
                arr[index++] = arr[i];
             }
          }
         // Create a copy of arr[] 
         return Arrays.copyOf(arr, index);
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int[] array = {  9, 2, 3, 1, 7, 2, 3, 5,9,9 };
        int key = 3;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}
/*
[9, 2, 1, 7, 2, 5]
 */

