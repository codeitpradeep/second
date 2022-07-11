package mycodejavaegm;

//Array - copy to another char 
public class pgm015 {
	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int len= a1.length;
		int a2[] = new int[len];
		System.out.println("Length"+len);
		System.out.print("->");
		for(int m=0;m < len; m++){
			a2[m]=a1[m];
		}
		for(int a:a2){
			System.out.print(a+" ");
		}
	}

}
/*
Length5
->1 2 3 4 5 
 */

