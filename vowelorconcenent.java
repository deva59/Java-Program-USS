import java.util.*;
class vow{
	public static void main(String args[]){
	System.out.println("Enter a choice");
	Scanner s= new Scanner(System.in);
 	char ch=s.next().charAt(0);
	
	switch(ch){

	case 'a':
	System.out.println("a is Vowel");
	break;
	

	case 'e':
	System.out.println("e is Vowel");
	break;
	

	case 'i':
	System.out.println("i is Vowel");
	break;
	

	case 'o':
	System.out.println("o is Vowel");
	break;
	
	
	case 'u':
	System.out.println("u is Vowel");
	break;
	

	
	default:
	System.out.println("Its Concenent");
	break;
	

}
}
}

