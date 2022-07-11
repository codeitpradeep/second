package thsisKeywrd;

class ggds {
	public String a, b;

	public ggds(String a) {
		this(a, a);
	}

	public ggds(String a, String b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {

		return this.a + " - " + this.b;
	}
}

public class thisconstroverld {

	public static void main(String[] args) {
		ggds t = new ggds("hi", "there");
		System.out.println(t);
		ggds t2 = new ggds("hi");
		System.out.println(t2);
	}
}
//hi - there
//hi - hi
