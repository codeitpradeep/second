package dayone;

import org.testng.annotations.Test;

public class findlrgr {
	@Test
	void getingid() {
		int a[] = { 5, 9, 3, 2, 4, 6 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}
}
