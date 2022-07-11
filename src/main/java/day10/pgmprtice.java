package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class pgmprtice {
	@Test
	void mypgmone() {
		
		String name = "abbdmd 4324nn wl1145345 kksd jbdsm kaak keee q".toLowerCase().replaceAll(" ", "");
		char[] s = name.toCharArray();
		List<String> ls = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<>();
		for (char c : s) {
			ls.add(String.valueOf(c));
		}
		
		
		//System.out.println(ls.get(0));
		ls.stream().filter(l -> l.contains("a")).forEach(l-> System.out.println(l));
		
		
		
	}

}
