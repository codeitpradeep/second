package mycodejavaegm;

//Find Prime number , m to nth all prime numbers
public class pgm011 {

	public static void main(String[] args) {
		int num = 29;
		boolean flag = false;
		for(int i=2; i <= num/2 ; ++i){
			//System.out.println(num+"%"+i);
			if(num % i == 0){
				flag = true;
				break;
			}else{
				flag = false;
				
			}
		}
		if(!flag){
			System.out.println("prime -"+num);
		}else{
			System.out.println("Not prime -"+num);
		}
		//find all prime in M to N 
		System.out.println("prime in M 20 to N 41");
		int m=20,n=41;
		flag = false;
		while(m <= n){
			//System.out.println(m);
			for(int i=2; i < m/2 ;++i){
				if(m % i == 0){
					flag = true;
					break;
				}else{
					flag = false;
				}
			}
			if(!flag && m!=0 && m!=1 ){
				System.out.println("prime -"+m);
			}else{
				
			}
			++m;
		}
	}

}
/*
prime -29
prime in M 20 to N 41
prime -23
prime -29
prime -31
prime -37
prime -41

 */

