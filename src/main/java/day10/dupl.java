package day10;

public class dupl {
	public static void main(String args[]) {
		String s = "Apple is not Banana";

		s = s.replaceAll("\\s", "");

		System.out.println(s);
		char ch[] = s.toCharArray();

//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] == ch[i]) {
//				System.out.println("E");
//			}
//		}
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != '_') {
					count++;

					ch[j] = '_';
				}
			}
			if (count >= 1 && ch[i] != '_') {
				System.out.println(ch[i] + " count " + count);
			}
			if (count > 1 && ch[i] != '_') {
				System.out.println(ch[i] + " duplicate " + count);
			}
		}

	}
}
