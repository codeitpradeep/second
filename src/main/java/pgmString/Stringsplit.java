package pgmString;

import java.util.Arrays;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otp = "sended successfully OTP : 32343 , sended successfully";
		
		String otpnum[] = otp.split("OTP : \\d*");
		System.out.println(otpnum[0]); //sended successfully 
		System.out.println(otpnum[1]); //, sended successfully
		
		String ef[] = otp.split("\\s");
		System.out.println(ef[0].toCharArray());
		Arrays.sort(ef[0].toCharArray());
		System.out.println(ef[0].toCharArray()[0]='i');
	}

}
