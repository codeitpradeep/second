package interfacepgm;

//create a interface and abstract method .
interface Polygon{
	void getArea(String string);
	// create default method , call this method as default 
	default void getSides(){
		System.out.println("All sides");
	}
}

interface Polygon2{
	void getArea(String string);
	// create default method , call this method as default 
	default void getSides(){
		System.out.println("All sides");
	}
}

//implements the Polygon and automatically abstract method to be define.
class Rectangle implements Polygon,Polygon2{
	//create and do any action indide as void
	public void getArea(String string){
		int area = 10 * 14;
		System.out.println("Rectangle area is - "+area);
	}
	//Here the default overridden method
	public void getSides(){
		System.out.println("Rectangle sides");
	}
}

//Same create implements Polygon
class Square implements Polygon{
	public void getArea(String string){
		int area = 10 * 10;
		System.out.println("Square area is - "+area);
	}
}

public class interfacepgmtwo {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.getSides(); 
		rect.getArea("Area");   //goes to Rectangle
		rect.getSides();  //calls default inside Rectangle
		
		Square sq = new Square();
		rect.getSides();
		sq.getArea("Area");  //goes to Square
		sq.getSides(); //calls default inside interface Polygon
	}

}
/*
Rectangle area is - 140
Rectangle sides
Square area is - 100
All sides

 */

