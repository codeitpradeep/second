package pgmString;

public class StringindexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		egone();
		twoeg();
	}

	private static void twoeg() {
		// TODO Auto-generated method stub
		String para = "Auto-generated method stub";
		System.out.println(para.indexOf("to" , 1));      //2
		System.out.println(para.indexOf("method" ,10));  //15
		System.out.println(para.indexOf("auto" ,10));  //-1
		System.out.println(para.substring(0, 3));
	}

	private static void egone() {
		// TODO Auto-generated method stub
		String para = "Auto-generated method stub otp : 3333";
		System.out.println(para.indexOf("to"));      //2
		System.out.println(para.indexOf("method"));  //15
	}

}
