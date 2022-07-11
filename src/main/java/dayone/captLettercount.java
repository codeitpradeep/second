package dayone;

import java.util.Arrays;

public class captLettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "AgdfDdfRc@gvs TwfSc-dRssdD AAssd";
		int caps=0,lowr=0,spl=0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				caps++;
				System.out.println(a.charAt(i));
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				System.out.println(a.charAt(i));
				lowr++;
			} else {
				if(a.charAt(i) != ' ') {
				System.out.println(a.charAt(i));
				spl++;
				}
			}
		}
		System.out.printf("Upper -%d "
				+ "Lower-%d "
				+ "Special-%d",caps,lowr,spl);
	}

}
