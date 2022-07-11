package dayone;

public class Palindrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "radar", rev = "";
		int len = given.length()-1;
		for (int i = len; i >= 0; i--) {
			//System.out.println();
			rev = rev + given.charAt(i);
		}
		System.out.println(rev);
		
		boolean get = rev.equals(given) ? true : false ;

		System.out.println(get);

	}

}
