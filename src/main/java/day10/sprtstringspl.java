package day10;

public class sprtstringspl {
	public static void main(String args[]) {
		String a = "PradeepD@gmail.com";
		String uppr = "", lwr = "", spl = "";
		char[] ch = a.toCharArray();
		
		//System.out.println();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				//System.out.println(ch[i]);
				uppr = uppr + ch[i];
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lwr = lwr + ch[i];
			} else if (ch[i] == '@' || ch[i] == '.') {
				spl = spl +ch[i];
			} else {
				// System.out.println(ch[i]);
			}
		}
		System.out.println("Upper - "+uppr);
		System.out.println("Lower - "+lwr);
		System.out.println("Special - "+spl);

	}
}
