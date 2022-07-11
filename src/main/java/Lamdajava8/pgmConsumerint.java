package Lamdajava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class pgmConsumerint  {
	public static void main(String args[]) {
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);

		ls.stream().forEach(t -> {
			System.out.println(t);
		});
	}
}
