package pgmString;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		egone();
		twoeg();

	}

	private static void twoeg() {
		// TODO Auto-generated method stub
		String a[]={"apple","orange","graps","apples"};
		System.out.printf("%s\n","Splite only apple using contains()");
		for(String fr:a){
			if(fr.contains("apple")){
				System.out.printf("%s\n",fr);
			}
		}
		/*
		Splite only apple using contains()
		apple
		apples
		 */
	}

	private static void egone() {
		// TODO Auto-generated method stub
		String para = "The apple is a fruit,apple is on bag , apple contian 3 q.no";
		
		System.out.println(para.contains("apple"));//true
		System.out.println(para.contains("The apple is a fruit"));//true
	}

}
