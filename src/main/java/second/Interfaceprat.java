package second;

interface aminals {
	public static int a = 100;

	void add();

//	void sub();

	default void sub() {
		System.out.println("Here");
	}

	static int tree() {
		int b = +1;
		return b;
	}
}

class doghome {
	void Aa() {
		// a=100;
	}
}

class dogs extends doghome implements aminals {

	static int i = 0;

	static int A() {
		i = i + 1;
		return i;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	// @Override
	public void sub() {

		System.out.println("Need to be FRR");
	}
	public void tree() {
		
	}
}

class cats implements aminals {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}
	public void tree() {
		
	}

}

public class Interfaceprat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			dogs d = new dogs();
			System.out.println(d.A());
		}

//		dogs d = new dogs();
//		d.sub();
//
//		cats c = new cats();
//		c.sub();

		System.out.println(aminals.tree());
		System.out.println(aminals.tree());
	}

}
