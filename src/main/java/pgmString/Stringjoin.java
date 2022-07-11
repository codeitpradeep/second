package pgmString;

public class Stringjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String smpl;
		System.out.println(String.join("-","22","04","1997"));
		//22-04-1997
		String uname[] ={"prad","vino","srih"};
		String empid[] ={"2739","2720","2711"};
		
		if(uname.length == empid.length){
			for(int i=0;i<uname.length;i++){
				System.out.println("Emp name :"+String.join("@",uname[i],empid[i]));
			}
		}
		/*
		Emp name :prad@2739
		Emp name :vino@2720
		Emp name :srih@2711
		 */
	}

}
