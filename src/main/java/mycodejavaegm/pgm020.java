package mycodejavaegm;

// Array Print Smallest number in array int 
public class pgm020 {

	public static void main(String[] args) {
		int a[] = {33,99,7,43,8,10};
		int min=a[0];
		for(int i=0; i < a.length ;i++){
			System.out.println(a[i]+" < "+min);
			if(a[i] < min){
				min=a[i]; 
			}
		}
		System.out.println("\nSmallest number "+ min);
	}

}
/*
33 < 33
99 < 33
7 < 33
43 < 7
8 < 7
10 < 7

Smallest number 7
 */

