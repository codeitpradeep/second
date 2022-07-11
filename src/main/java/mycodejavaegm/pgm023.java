package mycodejavaegm;

//Array Finding dulipcated count  
public class pgm023 {

	public static void main(String[] args) {
		int A[] = {1,2,2,2,4,4,8,5,5,5,5,5,6,6,6};
		
		int max = Integer.MIN_VALUE;
		
		for(int i =0 ;i< A.length; i++){
			if(A[i] > max){
				max = A[i];
			}
		}
		
		int B[] = new int[max+1];
		for(int i =0 ;i< A.length; i++){
			//B[A[i]]++;// B[i] = B[i]+1
			//System.out.println(A[i]);
			B[A[i]] = B[A[i]]+1;
			//System.out.println(i +" - "+B[A[i]]);
		}
		for(int i =0 ;i< max; i++){
			//System.out.println(B[i]);
			if(B[i] > 1){
			System.out.println(i +" "+B[i]);
			}
		}
	}

}
/*
2 3
4 2
5 5
6 3
 */

