package mycodejavaegm;

//Display a-Z A-Z 
public class pgm013 {

	public static void main(String[] args) {
		char c;
		c='A';
		//While ++char
		System.out.println(++c);
		for(c='a' ; c <= 'z';++c){
			System.out.print(c+"");
		}
		System.out.println("");
		for(c='A' ; c <= 'Z';++c){
			System.out.print(c+"");
		}
	}

}
/*
B
abcdefghijklmnopqrstuvwxyz
ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */

