import java.util.*;

class jac{
	public static void main(String[] args){
	System.out.println("Enter Char");
	Scanner x=new Scanner(System.in);
	char ch = x.next().charAt(0);

	if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){

	System.out.println(ch + " is an alphabet.");
        }
	else 
	{
        System.out.println(ch + " is not an alphabet.");
        }
}
}



















