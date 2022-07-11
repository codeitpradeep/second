package second;

class constregf {

	String language;

	// constructor with no parameter
	constregf() {
		this.language = "Java";
	}

	// constructor with a single parameter
	constregf(String language) {
		this.language = language;
	}

	public void getName() {
		System.out.println("Programming Langauage: "
				+ this.language);
	}

	public static void main(String[] args) {

		// call constructor with no parameter
		constregf obj1 = new constregf();

		// call constructor with a single parameter
		constregf obj2 = new constregf("Python");

		obj1.getName();
		obj2.getName();
	}
}

//Programming Langauage: Java
//Programming Langauage: Python
