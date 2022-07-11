package second;

class Addnum {
	int a, b;

	public int addsumnumber(int x, int y) {
		this.a = x;
		this.b = y;
		return a + b;

	}
}

public class constrtueeg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Addnum addsum = new Addnum();
		result = addsum.addsumnumber(4, 6);
		System.out.println("Calling add - " + result);

	}

}

//Calling add - 10