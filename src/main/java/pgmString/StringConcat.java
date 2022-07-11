package pgmString;
//
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		egone();
	}

	private static void egone() {
		// TODO Auto-generated method stub
		String firstname= "pradeep";
		String lastname = "dhanush";
		
		System.out.printf("Full name - %s\n",
				firstname.concat(lastname));
		//Full name - pradeepdhanush
		
		System.out.printf("Email format - %s\n",
				firstname.concat(lastname).concat("@domain.com"));
		//Email format - pradeepdhanush@domain.com
	}

}
