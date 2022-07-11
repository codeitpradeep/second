package pgmString;

public class StringcharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charategone();
		charategtwo();
		}

	private static void charategtwo() {
		// TODO Auto-generated method stub
		String para = "Hai ,Studied in Government college";
		for(int i=0;i<para.length();i++){
			if(i%2== 0){
				System.out.printf("index[%d] - charAt -%s \n",i,para.charAt(i));
			}
		}
		/*
		index[0] - charAt -H 
		index[2] - charAt -i 
		index[4] - charAt -, 
		index[6] - charAt -t 
		index[8] - charAt -d 
		index[10] - charAt -e 
		index[12] - charAt -  
		index[14] - charAt -n 
		index[16] - charAt -G 
		index[18] - charAt -v 
		index[20] - charAt -r 
		index[22] - charAt -m 
		index[24] - charAt -n 
		index[26] - charAt -  
		index[28] - charAt -o 
		index[30] - charAt -l 
		index[32] - charAt -g 
		 */
	}

	public static void charategone() {
		// TODO Auto-generated method stub
		String name = "Pradeep";
		System.out.println("Char at 2 is - "+name.charAt(2));
		for(int i=0;i<name.length();i++){
			System.out.println("Char at index"+i+" is - "+name.charAt(i));
		}
		/*
		Char at 2 is - a

		Char at index0 is - P
		Char at index1 is - r
		Char at index2 is - a
		Char at index3 is - d
		Char at index4 is - e
		Char at index5 is - e
		Char at index6 is - p 
		*/
	}

}
