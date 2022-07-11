package second;

public class Arraydisplaydatagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] perstge = { 0, 0, 7, 0, 0, 0, 1, 2, 4, 2, 1}; 
		 
		 for(int count = 0 ; count < perstge.length ; count++ ){
			 if(count == 10){
				 System.out.printf("%5d  :", count*10);				 
			 }
			 else{
				 System.out.printf("%02d-%02d  :",count*10 ,count * 10+9);
			 }
			 
			 
			 for(int strs = 0 ; strs < perstge[count];strs++){
				 System.out.print("*");
			 }
			 System.out.println(); 
		 }
		 
		 
	}
}

/*
00-09  :
10-19  :
20-29  :*******
30-39  :
40-49  :
50-59  :
60-69  :*
70-79  :**
80-89  :****
90-99  :**
  100  :*
 */
