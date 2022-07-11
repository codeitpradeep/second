package mycodejavaegm;
//Check Palindrome String , reverse items

public class pgm014 {

	public static void main(String[] args) {
		System.out.println("Method 1 -");
		String str = "Radar", revstr = "";
		int len = str.length();

		for (int i = (len - 1); i >= 0; --i) {
			revstr = revstr + str.charAt(i);
			System.out.println(revstr);
		}
		if (revstr.equalsIgnoreCase(str)) {
			System.out.println(revstr);
		}
		System.out.println("Method 2 -");
		int num = 353, revsnum = 0, rem;
		int orglnum = num;
		while (num != 0) {
			rem = num % 10;
			revsnum = revsnum * 10 + rem;
			num = num / 10;
		}
		if (orglnum == revsnum) {
			System.out.println(revsnum);
		}
	}

}
/*
 * Method 1 - r ra rad rada radaR radaR Method 2 - 353
 */
