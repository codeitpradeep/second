package pgmString;

public class StringisEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "pradeep";
		String lname = "";
		
		if(fname.isEmpty() || lname.isEmpty()){
			System.out.printf(" fname - %s \n lname - %s",fname,lname);
		}
	}
	/*
	fname - pradeep 
 	lname -
	 */

}
