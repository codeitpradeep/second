package mycodejavaegm;

//Array - find duplicate of same number
public class pgm017 {

	public static void main(String[] args) {
		int a[] = {10,20,5,6,6,1,2,2,20,5,10};
		int j=0;
		int b[] = new int[a.length];
		for(int m=0;m<a.length;m++){
			for(int n= m+1;n<a.length;n++){
				//System.out.println(m+" "+n);
				if(a[m] == a[n]){
					System.out.println("Dulp- "+a[m]);
					
				}
			}
		}
		
	}

}
/*
Dulp- 10
Dulp- 20
Dulp- 5
Dulp- 6
Dulp- 2
 */

