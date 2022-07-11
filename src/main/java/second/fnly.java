package second;

public class fnly {

	public static void main(String[] args) {
		
		final int a= 10;
		
		fnly obj = new fnly();
		// printing the hashcode
		System.out.println("Hashcode is: " + obj.hashCode());
		obj = null;
		//System.out.println("Hashcode is: " + obj.hashCode());
		//Cannot invoke "Object.hashCode()" because "obj" is null
		
		// calling the garbage collector using gc()
		System.gc();
		System.out.println("End of the garbage collection");
	}
	
	

	// defining the finalize method
	protected void finalize() {
		System.out.println("Called the finalize() method");
	}
}
