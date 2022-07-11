package pgmString;

public class StringequalsandequalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pgone();
		pgtwo();
	}

	private static void pgtwo() {
		// TODO Auto-generated method stub
		String name = "pradeep";
		System.out.printf("Name %s equals with - %b\n",
				name,name.equalsIgnoreCase("pradeep"));
		name = "Pradeep";
		System.out.printf("Name %s equals with - %b\n",
				name,name.equalsIgnoreCase("pradeep"));
		/*
		Name pradeep equals with - true
		Name Pradeep equals with - true
		 */
		
	}

	private static void pgone() {
		// TODO Auto-generated method stub
		String name = "pradeep";
		System.out.printf("Name %s equals with - %b\n",name,name.equals("pradeep"));
		name = "Pradeep";
		System.out.printf("Name %s equals with - %b\n",name,name.equals("pradeep"));
	}
	/*
	Name pradeep equals with - true
	Name Pradeep equals with - false
	 */
}
