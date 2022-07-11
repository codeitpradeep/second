package day10;

public class reverspalindrm {
	public static void main(String[] args) {
	int num = 3443;
	int revrse =0;
	int remindr =0;
	int orgnum=num;
	
	//
	while(num != 0) {
		remindr = num % 10; // remainder last number q
		revrse = revrse * 10 + remindr; //last number	
		num = num / 10;
	}
	
	if(revrse == orgnum) {
		System.out.println("True");
	}
}
}