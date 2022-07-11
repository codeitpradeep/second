package mycodejavaegm;

//Find single char Alphabet is Vowel or Consonant
public class pgm009 {
	public static void main(String[] args) {
		char ch = 'E';
		//Using if(), || operator
		if(ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch == 'U'){
			System.out.println("Vowel char is "+ch);
		}
		//Using switch()
		System.out.println("Using Switch");
		ch = 'U';
		switch(ch){
		case 'A':
			System.out.println("Vowel char is "+ch);
		break;
		case 'E':
			System.out.println("Vowel char is "+ch);
		break;	
		case 'I':
			System.out.println("Vowel char is "+ch);
		break;	
		case 'O':
			System.out.println("Vowel char is "+ch);
		break;	
		case 'U':
			System.out.println("Vowel char is "+ch);
		break;	
		}
	}

}
/*
Vowel char is E
Using Switch
Vowel char is U
 */

