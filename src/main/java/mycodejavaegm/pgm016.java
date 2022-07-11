package mycodejavaegm;
//Array -remove duplicate element
import java.util.Arrays;

public class pgm016 {
	private static int rmvdulpele(int[] a, int len) {
		if(len== 1 || len== 0){
			return len;
		}
		int[] temp = new int[len];
		int j=0;
		System.out.println("Totel Length - "+len);
		for(int i=0;i< len-1;i++){
			if(a[i] != a[i+1]){
				temp[j++] = a[i];
				
			}
		}
		
		temp[j++] = a[len-1];
		
		for(int i=0;i<j;i++){
			a[i] = temp[i];
		}
		
		return j;
	}

	public static void main(String[] args) {
		
		//Sorted array
		int a[]={10,60,20,30,40,40,40,40,80,80,80,80,50};
		int len = a.length;
		
		//Un-Sorted array
		Arrays.sort(a);
		
		len = rmvdulpele(a,len);
		
		for(int i=0;i<len;i++){
			System.out.print(a[i]+" ");
		}
		
	}

	
}
/*
Totel Length - 8
->10 20 30 40 50 60 80 
 */

