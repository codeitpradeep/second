package second;

public class newsmapletwo {

	public static void main(String[] args) {
		/* Find grater number 
		int a= 10;
		int b= 20;
		
		if(a<b){
			System.out.println("Greater number than a");
		}
		/* Output
		 * Greater number than a
		 */
		
		/*
		 Find odd or even using if else 
		 */
		int a= 13;
		if(a%2==0){
			System.out.println("Given no.is even");
		}else{
			System.out.println("Given no.is Odd");
		}
		/* Output
		 * Given no.is Odd
		 */
		/*
		 * LEAP year or not ,we use Logical operator || ,&&
		 */
		int year = 2020;
		System.out.println((year % 4 == 0));
		System.out.println((year % 100 != 0));
		System.out.println(((year % 4 == 0) && (year % 100 != 0)));
		System.out.println((year % 400 == 0));
		System.out.println((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)));
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			System.out.println("Leap year "+year);
		}
		/* Output
		    true
			true
			true
			false
			true
			Leap year 2020
		 */
		
		/* Odd or Even using Ternary operator return as string ?: (condition- true or false)?"true":"false"; */
		int num = 15;
		String result = (num % 2 == 0)?"Even":"Odd";
		System.out.println("Given no.is "+result);
		/* Output
	    Given no.is Odd
	    */
		
		/* Nested if Program for execute two if inside if  */
		int age= 20;
		int saturation = 96 ;
		if(age>=18){
			if(saturation>=92){
				System.out.println("Person normal");
			}
		}
		/* Output
	    Person normal
	    */
		/* Nested if Program for execute two if inside if-else  */
		int ageprn= 20;
		int saturationprn = 86 ;
		if(ageprn>=18){
			if(saturationprn>=92){
				System.out.println("Person normal");
			}else{
				System.out.println("Person critical condition");
			}
		}
		/* Output
	    Person critical condition
	    */
		
		/* Java if-else-if ladder is used to decide among multiple options. The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final else statement will be executed. */
		/* Program to find grade  using integer */
		int grade=70;
		if(grade<=50){
			System.out.println("Failed");
		}else if(grade<=100 && grade>90 ){
			System.out.println("A+");
		}else if(grade<=90 && grade>70 ){
			System.out.println("A Grade");
		}else if(grade<=70 && grade>50 ){
			System.out.println("B Grade");
		}else{
			System.out.println("Invalid");
		}
		/* Output
	    B Grade
	    */
		
		/* 
		 * switch statement
		 * The switch statement is a multi-way branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. Basically, the expression can be byte, short, char, and int primitive data types.
		 */
		/* switch(expression)
				{
				   // case statements
				   // values must be of same type of expression
				   case value1 :
				      // Statements
				      break; // break is optional
				   
				   case value2 :
				      // Statements
				      break; // break is optional
				   
				   // We can have any number of case statements
				   // below is default statement, used when none of the cases is true. 
				   // No break is needed in the default case.
				   default : 
				      // Statements
				} 
		 */
		System.out.println("---------Switch----------");
		/* Program to find number using switch */
		int ade = 80;
		switch(ade){
		case 20 : System.out.println("It's 20");
		break;
		case 40 : System.out.println("It's 40");
		break;
		case 80 : System.out.println("It's 80");
		break;
		default:
			System.out.print("default");
		}
		/*Output
		 * It's 80
		 */ 
		/* Program to show first 4 month using switch  */
		int mnth = 2;
		String mnthname = "";
		switch(mnth){
		case 1: System.out.print("JAN - 1");
		mnthname="JAN";
		break;
		case 2: System.out.print("JAN - 1");
		mnthname="FEB";
		break;
		case 3: System.out.print("JAN - 1");
		mnthname="MAR";
		break;
		case 4: System.out.print("JAN - 1");
		mnthname="APR";
		break;
		default:
			
		}
		System.out.println(" Selected month - "+ mnthname);
		/* Output
		 * JAN - 1 Selected month - FEB
		 * */
		/* Program to find Student details using Nested switch */
		int yr = 4;
		String branch = "CSE";
		switch(yr){
		case 1 : System.out.print("Yesr 1");
		break;
		case 4 : 
			switch(branch){
			case "CSE" : System.out.println("Final semester");
			break;
			}
			
		}
		/* Output 
		 * Final semester
		 */
		/* Program using WRAPPER class */
		Integer  ager = 18;
		switch(age){
		case (18): System.out.println("Crossed 18");
		break;
		}
		
		System.out.println("//---------------- FOR LOOP --------------------");
		/*
		 * Java for loop is used to run a block of code for a certain number of times
		 * The initialExpression initializes and/or declares variables and executes only once.
			The condition is evaluated. If the condition is true, the body of the for loop is executed.
			The updateExpression updates the value of initialExpression.
			The condition is evaluated again. The process continues until the condition is false.
		 */
		/* Program to write count 1 to 10 using for loop */
		int astrt = 1;
		int aend = 10;
		for(int i=0;i<=aend;i++){
			System.out.println("Count -- "+i);
		}/* Output
		Count -- 0
		Count -- 1
		Count -- 2
		Count -- 3
		Count -- 4
		Count -- 5
		Count -- 6
		Count -- 7
		Count -- 8
		Count -- 9
		Count -- 10
		*/
		
		/* Program to write i ,j for loop matrix , nested loop  */
		
		int getno = 5;
		for(int i=0;i<=getno;i++){
			for(int j=0;j<=getno;j++){
				System.out.println(i+" - "+j);
			}
		}/*
		0 - 0
		0 - 1
		0 - 2
		0 - 3
		0 - 4
		0 - 5
		1 - 0
		1 - 1
		1 - 2
		1 - 3
		1 - 4
		1 - 5
		2 - 0
		2 - 1
		2 - 2
		2 - 3
		2 - 4
		2 - 5
		3 - 0
		3 - 1
		3 - 2
		3 - 3
		3 - 4
		3 - 5
		4 - 0
		4 - 1
		4 - 2
		4 - 3
		4 - 4
		4 - 5
		5 - 0
		5 - 1
		5 - 2
		5 - 3
		5 - 4
		5 - 5
		*/
		/* Program for Pyramid using FOR loop*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* "+i+" - "+ j);
			}
			System.out.println();
		}
		/*
		 	* 
			* * 
			* * * 
			* * * * 
			* * * * * 
			
			<br>
		 */
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 	* * * * * 
			* * * * 
			* * * 
			* * 
			* 
		 */
		
		
		System.out.println("----------while----------");
		/* While Java while loop is used to run a specific code until a certain condition is met */
		int i=1;
		while(i<=5){
			System.out.print(i);
			i++;
		}
		/*
		 12345
		 */
		System.out.println("----------Break----------");
		/* Program for Break using for loop */
		for(int x=0;x<=4;x++){
			for(int y=0;y<=4;y++){
				
				if(x==2){
					break;
				}
				System.out.print(x+"*"+y+" ");
			}
			System.out.println();
		}
		/* 
		 *  0*0 0*1 0*2 0*3 0*4 
			1*0 1*1 1*2 1*3 1*4 
			
			3*0 3*1 3*2 3*3 3*4 
			4*0 4*1 4*2 4*3 4*4
		 */
		/* Program for Break using for loop aa: bb: */
		aa:
		for(int x=0;x<=4;x++){
			
			for(int y=0;y<=4;y++){
				
				if(x==2){
					break aa;
				}
				System.out.print(x+"*"+y+" ");
			}
			System.out.println();
		}
		/* comes out of the loop
		 0*0 0*1 0*2 0*3 0*4 
		 1*0 1*1 1*2 1*3 1*4
		 */
		
		
		System.out.println("----------Continue----------");
		/* Program for Break using for loop */
		for(int x=0;x<=4;x++){
			for(int y=0;y<=4;y++){
				
				if(x==2){
					continue;
				}
				System.out.print(x+"*"+y+" ");
			}
			System.out.println();
		}
		/* 
		 *  0*0 0*1 0*2 0*3 0*4 
			1*0 1*1 1*2 1*3 1*4 
			
			3*0 3*1 3*2 3*3 3*4 
			4*0 4*1 4*2 4*3 4*4
		 */
		/* Program for Break using for loop aa: bb: */
		aa:
		for(int x=0;x<=4;x++){
			
			for(int y=0;y<=4;y++){
				
				if(x==2){
					continue aa;
				}
				System.out.print(x+"*"+y+" ");
			}
			System.out.println();
		}
		/* comes out of the loop
		 0*0 0*1 0*2 0*3 0*4 
		 1*0 1*1 1*2 1*3 1*4
		 3*0 3*1 3*2 3*3 3*4 
		 4*0 4*1 4*2 4*3 4*4 
		 */
		
		
		
	}
	
	

}
