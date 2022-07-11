package day10;

public class fibsrc {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
		int num = 6,i=0,first=0,secnd=1;
		
		//System.out.print("fib -"+i);
		while(i <= 6) {
			System.out.println(first);
			
			int nxtnum = first + secnd;
			first = secnd;
			secnd = nxtnum;
			i++;
		}

	}

}
