package day10;

import java.util.Iterator;

public class largst {
	public static void main(String args[]) {
		int[] s = { 10, 6, 1, 9, 3, 2 };
		int max = s[0];
		for (int i = 0; i < s.length; i++) {
			if (max >= s[i]) {
				max = s[i];
			}
		}
		System.out.println(max);

		char[] a = { 'y', 'a', 'r', 'b' };
		char temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println(a);
	}
}
