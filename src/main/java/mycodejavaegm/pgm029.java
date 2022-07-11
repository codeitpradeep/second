package mycodejavaegm;

//Array - Number of Occurrence
public class pgm029 {
	static final int MAX_CHAR = 256;
	 
    static void getOccuringChar(String str)
    {
         int[] counts = new int[MAX_CHAR];
         
         for(int m=0;m<str.length();m++) {
        	 //System.out.println(str.charAt(m));
        	 counts[str.charAt(m)]++;
         }
         
         int ch[] =new int[str.length()];
         for(int i=0;i<str.length();i++) {
        	 ch[i] = str.charAt(i); 
        	 int singlecount = 0;
        	 for(int j=0;j<=i;j++) {
        		 System.out.println(str.charAt(i)+" == "+ch[j]);
        		 if(str.charAt(i) == ch[j]) {
        			
        			 singlecount++;
        		 }
        	 }
        	 
        	 if(singlecount==1) {
        		 System.out.println(str.charAt(i)
        				 +" == "+ counts[str.charAt(i)]);
        	 }
         }
              
       
    }
	public static void main(String[] args) {
		String str = "igeeksforgeeks";
        getOccuringChar(str);
	}

}
/*

 */

