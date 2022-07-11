package day10;


class Janani{
	String chat = "no";
}

class Anu {
	public int apple = 20;
	public String chat = "no";
	
	Anu(String chat){
		this.chat = chat;
		System.out.println("First my frined !!!!!!!!!!!"+chat);
	}
	
	public void getchatrespnce() {
		System.out.println("Here we try to use this technique -"+chat);
	}
	
	public void getapple() {
		System.out.println(apple);

	}

}

public class ishwarya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		// add(a,b);
		//ishwarya.add(a, b);

//		ishwarya sm = new ishwarya();
//		sm.addition(a, b);

		Anu myfrnd = new Anu("hi");
		myfrnd.getapple();
		myfrnd.getchatrespnce();

		//System.out.println(myfrnd.apple);
	}

	public void addition(int a, int b) {
		int new1 = a;
		int new2 = b;
		int result = new1 + new2;

		System.out.println("Result is " + result);

	}

	public static void add(int a, int b) {
		int new1 = a;
		int new2 = b;
		int result = new1 + new2;

		System.out.println("Result is " + result);
	}

}