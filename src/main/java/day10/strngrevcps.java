package day10;

import java.util.Arrays;

public class strngrevcps {
	public static void main(String[] args) {
		String str = "How are You?".toLowerCase(); // Woh Era Uoy?

		String[] s = str.split("\\s");
		for (String ll : s) {
			System.out.print(rev(ll) + " ");
		}
	}

	public static String rev(String s) {
		// TODO Auto-generated method stub
		int r = 1, ind = 0;
		String sa = "", exp = "";
		char[] a = s.toCharArray();
		char[] b = null;
		if (s.contains("?")) {
			exp = String.valueOf(a[3]);
			// System.out.println(a[3]);
			for (int i = a.length - 2; i >= 0; i--) {
				// System.out.println(i);
				if (a.length - 2 == i) {
					sa = sa + String.valueOf(a[i]).toUpperCase();
				} else {
					sa = sa + a[i];
				}
			}
		} else {
			for (int i = a.length - 1; i >= 0; i--) {
				// System.out.println(i);
				if (a.length - 1 == i) {
					sa = sa + String.valueOf(a[i]).toUpperCase();
				} else {
					sa = sa + a[i];
				}
			}
		}
		return sa + exp;
	}
}
