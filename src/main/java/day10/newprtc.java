package day10;
class Parent{
	public String n = "Pe";
	void me() {
		System.out.println("Pr");
	}
}
class Child extends Parent{
	public String n = "Ce";
	void me() {
		System.out.println("Chr");
	}
}
public class newprtc {
	 public static void main(String[] args) {
	        Parent p = new Child();
	        System.out.println(p.n);
	        p.me();
	    }
}
