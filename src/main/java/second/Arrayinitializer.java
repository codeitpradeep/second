package second;

public class Arrayinitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize array
		int[] a = {22,33,44,55,66,77};
		System.out.printf("%s%8s%n","Index","vlaue");
		
		for(int counter=0;counter < a.length;counter++){
			System.out.printf("%5d%8d%n",counter,a[counter]);
		}

	}

}
