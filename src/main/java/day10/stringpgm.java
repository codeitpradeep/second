package day10;

import java.util.*;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class stringpgm {

	void newas() {
		String s = "Adfaarttessaaa33fdddwww55dd5sss55ddd5";

		List<String> ls = Arrays.asList(s.split(""));

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String ss : ls) {
			if (hm.get(ss) == null) {
				hm.put(ss, 1);
			} else {
				hm.put(ss, hm.get(ss) + 1);
			}
		}

		for (Map.Entry<String, Integer> k : hm.entrySet()) {
			System.out.println("Letter : " + k.getKey() + " No of occurence : " + k.getValue());
		}

		Collections.reverse(ls);

	}

	void newcase2() {

		List<String> ls = Arrays.asList("aaabbbbbbbbbbiinnnnnnnnn".split(""));
		HashMap<String, Integer> hm = new HashMap<>();

		for (String ss : ls) {
			if (hm.get(ss) == null) {
				hm.put(ss, 1);
			} else {
				hm.put(ss, hm.get(ss) + 1);
			}
		}

		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}

	void newatstrrv() {

		String s = "grab", c = "brag";

		List<String> ls = Arrays.asList(s.split(""));
		List<String> lc = Arrays.asList(c.split(""));

		Collections.sort(ls);
		Collections.sort(lc);

		System.out.println(ls.equals(lc));

		char[] ar = s.toCharArray();

		Arrays.sort(ar);

		for (char ss : ar) {
			System.out.println(ss);
		}

	}

	void newstrnewat() {

		List<String> ls = Arrays.asList("1", "2");

		Collections.swap(ls, 0, 1);

		System.out.println(String.valueOf(ls));

	}

	void getallnews() {

		String[] s = "3413241343gewasdsdferraaakkkkfffreee".split("");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// System.out.println(s[0]);
		for (String S : s) {
			if (hm.get(S) == null) {
				hm.put(S, 1);
			} else {
				hm.put(S, hm.get(S) + 1);
			}
		}

		Set<String> se = new HashSet<String>(Arrays.asList(s));

		hm.entrySet().stream().filter(k -> k.getKey().equalsIgnoreCase("a"))
				.forEach(k -> System.out.println(k.getValue()));

//		se.stream().filter(l -> {
//			if(hm.get(l) != 1) {
//				return true;
//			} else if (true) {
//				return true;
//			} else {
//				return false;
//			}
//		}).forEach(null);

	}

	void getnewpaa() {

		int[] a = { 1, -4, 2, 3, -8 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}

		for (int i : a) {
			System.out.println(i);
		}

	}

	void getalltestin() {
		String s = "aaaaafffffffffeeeeeeessssxcvvvvvgfsdeasdffaetrdgfd";

		char[] ch = s.toCharArray();
		// System.out.println(ch[0]);

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int j, temp = 0;

		List<Integer> ls = new ArrayList<Integer>();
		for (int A : a) {
			ls.add(A);
		}

		for (int i = 1; i < a.length; i++) {
			// System.out.println(a[i]);
			if (i % 2 != 0) {
				temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
			}
			i = i + 1;
		}

		for (int i = 1; i < a.length; i++) {
			System.out.println(a[i]);
			if (i % 2 != 0) {
				Collections.swap(ls, i, i - 1);
			}
			i = i + 1;
		}

		for (int A : a) {
			System.out.print(A + " ");
		}
		System.out.println();
		for (int L : ls) {
			System.out.print(L + " ");
		}

	}

	void metestget() {

		char[] a = { 'b', '.', '.', 'd', '.', 'a' };
		char temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] != '.') {

					if (a[i] < a[j]) {
						temp = a[j];
						a[j] = a[i];
						a[i] = temp;
						System.out.println(i + " " + j);
					}
				}

			}
		}

		System.out.println(a);
		// d . . b . a

	}
	
	
	void getdupremve() {
		String s = "aaaaafffffffffeeeeeeessssxcvvvvvgfsdeasdffaetrdgfd";

		char[] ch = s.toCharArray();
		
		
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b= {2,5};
		int[] c = new int[a.length - b.length] ;
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(b[j] == a[i]) {
					a[i] = 0;
				}
			}
		}
		
		for (int i : a) {
			if( i != 0) {
				c[t++] = i ;
			}
		}
		for (int i : c) {
			System.out.println(i);
		}
		
	}
	
	void grtsdup() {
		int[] a = { 1, 2, 1, 4, 5, 6, 2, 6 };
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j] == a[i]) {
					System.out.println(a[i]);
					a[i] = 0;
				}
			}
		}
		for (int i : a) {
			//System.out.println(i);
		}
		
	}
	
	
	void gethldres() {
		int[] a = {1,5,3,2};
		
		// a[0] + a[1 2 3] = a[all]
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] != a[j]) {
					for (int k = 0; k < a.length; k++) {
						if((a[i]+a[j]) == a[k] ) {
							System.out.println(a[i]+" "+a[j]+" "+a[k]);
							
						}
						
					}
					
				}
				
			}
			
		}
		
		
	}
	
	
	
	void nowjava() {
		
		String a = "fdd vda wedf c sdzsd";
		
		String b[] = a.split("\\s");
		List<String> l = Arrays.asList( a.split("\\s"));
		System.out.println(l);
		
		Collections.reverse(l);
		
		for(String s:l) {
			System.out.println(revthis(s));
		}
		
		
		
		
	}

	private String revthis(String s) {
		// TODO Auto-generated method stub
		String sa = null ;
		
		char[] swp = s.toCharArray();
		for(int i = swp.length-1;i>=0;i--) {
			sa = sa+swp[i];
		}
		
		return sa;
	}
	
	
	void oocrns() {
		
		String s = "dafszdveasd";
		List<String> l = Arrays.asList(s.split(""));
		System.out.println(l);
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String g:l) {
			if(hm.get(g) == null) {
				hm.put(g, 1);
			}else {
				hm.put(g, hm.get(g)+1);
			}
		}
		System.out.println(hm);
		
	}
	
	
	void gethastest() {
		String a = "dafszdveazsd";
		String b = "dz";
		
		List<String> aa = Arrays.asList(a.split(""));
		List<String> bb = Arrays.asList(b.split(""));
		
		HashMap<String,Integer> hm =new HashMap<>();
		
		for(String n:bb) {
			for(int j=0;j<aa.size();j++) {
				if(aa.get(j).equalsIgnoreCase(n)) {
					aa.set(j, "_");
				}
			}
		}
		for(String g:aa) {
			if(g != "_") {
				System.out.println(g);
			}
		}
		
		for(String i:bb) {
			if(hm.get(i) == null) {
				hm.put(i,0);
				for(String j:aa) {
					if(hm.get(j) != null) {
						hm.put(i, hm.get(i)+1);
					}
				}
			}
		}
		
		System.out.println(hm);
		
	}
	@Test
	void gethastestd() {
		String a = "dafszdveazsd";
		String b = "dz";
		
		List<String> aa = Arrays.asList(a.split(""));
		List<String> bb = Arrays.asList(b.split(""));
		
		HashMap<String,Integer> hm =new HashMap<>();
		
		
		for(String x:bb) {
			for(String y:aa) {
				if(x.equalsIgnoreCase(y)) {
					if(hm.get(y) == null) {
						hm.put(y, 0);
					}else {
						hm.put(y, hm.get(y)+1);
					}
				}else {
					if(hm.get(y) == null) {
						hm.put(y, 0);
					}
				}
			}
		}
		
		
		System.out.println(hm);
		
	}
	
}
