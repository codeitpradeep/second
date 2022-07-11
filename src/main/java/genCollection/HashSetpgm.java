package genCollection;

import java.util.*;

public class HashSetpgm {
	// HashSet imp point - not allow duplicate , only unique
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.printf("%s\n", "HashSet add new Element");

		Set<String> hashset = new HashSet<>();

		hashset.add("Orange");
		hashset.add("Bapes");
		System.out.printf("Add return for dulpicate - %s\n", hashset.add("Apple"));
		// hashset.add("Apple");
		System.out.printf("Add return for dulpicate - %s\n", hashset.add("Orange"));
		// hashset.add("Orange");

		// HashSet convert Set to ascending order
		hashset.add("Apple");

		for (String a : hashset) {
			System.out.printf("%s\n", a);
		}

		// Iterator - To iterator() hashset or retrive hashset display all
		System.out.printf("\n%s\n", "iterator() display Element");

		Iterator<String> itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.printf("%s\n", itr.next());
		}

		// Hashset

		// remove(element) will remove specific elements
		hashset.add("Banana");
		System.out.printf("\nRemove Grapes : %s\nAfter remove() -%s\n", hashset.remove("Grapes"), hashset);

		Set<String> sa = new HashSet<>();
		sa.add("Tomato");
		sa.add("Potato");
		sa.add("Carret");
		// addAll we add both hashset into one single hashset
		hashset.addAll(sa);
		System.out.printf("\nAddall elements : %s\n", hashset);

		
		// removeAll - Specific HashSet element
		// Here we remove those element present in one hashset.removeAll(from another
		// set)
		hashset.removeAll(sa);
		System.out.printf("\nAfter removeAll elements : %s\n", hashset);

		sa.add("Tomato");
		sa.add("Potato");
		sa.add("Carret");
		hashset.addAll(sa);
		// removeIf - will remove all elements contains 'to'
		System.out.printf("\nBefore removeIf elements : %s\n", hashset);
		hashset.removeIf(e -> e.contains("to"));
		System.out.printf("After removeIf (remove elements contains('to') ) elements : %s\n", hashset);

		// clear() - make HashSet Empty
		hashset.clear();
		System.out.printf("\nAfter Clear element will be empty: %s\n", hashset);

		// clone() - making shallow copy of a specific HashSet
		HashSet<String> orgn = new HashSet<>();
		orgn.add("add");
		orgn.add("sub");
		orgn.add("div");
		orgn.add("mul");

		Set<String> clonehashset = new HashSet<>();
		clonehashset = (HashSet) orgn.clone();
		System.out.printf("\nUsing clone() we copy to new HashSet : %s\n", clonehashset);

		// contains(Object o) - return true if this set contains the specified element

		Set<String> cal = new HashSet<>();
		cal.add("add");
		cal.add("sub");
		cal.add("div");
		cal.add("mul");
		System.out.printf("\nUsing contains(Object) find add,mul -%s\n", cal);
		for (String ss : cal) {
			if (ss.contains("add") || ss.contains("mul")) {
				System.out.printf("contains(%s) found\n", ss);
			}
		}
		
		System.out.println(cal.contains("add"));
		
		cal.stream().filter(k -> k.contains("add")).forEach(k -> System.out.println(k));

	}

}
