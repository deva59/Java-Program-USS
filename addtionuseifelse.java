import java.util.*;
class menu{
	public static void main(String[]args){
	int a,b;
	Scanner s =new Scanner(System.in);
	System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
	System.out.println("Enter a Choice");
	int ch=s.nextInt();
	System.out.println("Enter a Two number");
	a=s.nextInt();
	b=s.nextInt();
	if(ch==1){
	
	System.out.println("the addtion of "  + a + " and " + b + (a+b));
        }

	if(ch==2){
	
	System.out.println("the addtion of " + a + " and " + b + (a-b));
        }

	if(ch==3){

	System.out.println("the addtion of "  + a + " and " + b + (a*b));
        }

	if(ch==4){

	System.out.println("the addtion of "  + a + " and " + b + (a/b));
        }

	if(ch==5){
	System.out.println("Wrong Choice");
        }
}
}
