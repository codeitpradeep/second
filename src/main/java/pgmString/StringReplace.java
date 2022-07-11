package pgmString;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currency = "$1200";
		
		System.out.println(currency.replace("$"," ").trim()); //1200
		
		System.out.println(currency.replace("$","RS").trim()); //RS1200
		
		// replaceAll - useed to replaceall with regex
		String file[] = {"mp4","mp3","wav"};
		for(String a:file){
			System.out.println(a.replaceAll("\\d", "format"));
		}
		/*
		mpformat
		mpformat
		wav
		 */
	}

}
