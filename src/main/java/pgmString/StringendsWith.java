package pgmString;

public class StringendsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		egone();
		egtwo();
	}

	private static void egtwo() {
		// TODO Auto-generated method stub
		System.out.printf("%s\n","Seperate mail domain using endsWith");
		String emails[] = {"aaa@gmail.com","bbbbaa@gmail.com",
				"ddd@hotmail.com","ccccc@gmail.com"};
		for(String em: emails){
			if(em.endsWith("gmail.com")){
				System.out.printf("%s\n",em);
			}
		}
		/*
		Seperate mail domain using endsWith
		aaa@gmail.com
		bbbbaa@gmail.com
		ccccc@gmail.com
		 */
		
	}

	private static void egone() {
		// TODO Auto-generated method stub
		String filename = "music.mp4";
		System.out.printf("Finding mp4 format - %b\n",filename.endsWith(".mp4"));
		//Finding mp4 format - true
	}

}
