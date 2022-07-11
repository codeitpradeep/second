package pgmString;

public class StringStartwith {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file[] = {"mp4","mp3","wav"};
		for(String a:file){
			System.out.println(a.startsWith("mp"));
		}
		/*
		true
		true
		false
		 */
	}
}
