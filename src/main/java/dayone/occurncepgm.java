package dayone;

import java.util.Arrays;

public class occurncepgm {
	public static void main(String[] args) {
	String a = "413124131";
	char[] ch= new char[256];
	
	//find its duplicate
	char[] ar = a.toCharArray();
	
	Arrays.sort(ar);
	
	int first = 0,count = 0;
	for(int i=0;i<a.length();i++) {
		count = 1;
		for(int j=i+1;j<a.length();j++) {
			if(ar[i] == ar[j] ) {
				count++;
				
				ar[j]=0;
			}
			
		}
		if((count>=1) && ar[i]!=0) {
			ch[first++] = ar[i];
		System.out.printf("%s %d\n",ar[i],count);
		}
	}
	
	
	for(int i=0;i<ch.length ; i++) {
		System.out.println(ch[i]);
	}
	
}
}
