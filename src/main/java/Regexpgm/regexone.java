package Regexpgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otp = "sended successfully OTP : Z3A3e3 , sended successfully";
		
		Pattern p = Pattern.compile("OTP : [a-zA-Z0-9]{5,7}");
		Matcher m = p.matcher(otp);
		
		System.out.println(m.find());
		System.out.println(m.group());
		
		Pattern pw = Pattern.compile("[a-zA-Z0-9]{5,7}");
		Matcher mw = pw.matcher(m.group());
		System.out.println(mw.find());
		System.out.println(""+mw.group());
		
	}
}
