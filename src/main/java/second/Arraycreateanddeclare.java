package second;
//creating and initializing an Array
public class Arraycreateanddeclare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		
		System.out.printf("%s%8s%n","Index","vlaue");
		
		for(int counter=0;counter < a.length;counter++){
			System.out.printf("%5d%8d%n",counter,a[counter]);
		}
	}

}
