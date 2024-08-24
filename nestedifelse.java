import java.util.*;
class calcult{
	public static void main(String args[]){
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("1.Add \n2.Mul \n3.Div \n4.Sub");
	System.out.println("Enter a choice");
	int ch=s.nextInt();
	System.out.println("Enter a two number");
	a = s.nextInt();
	b = s.nextInt();
	
if(ch==1){
	System.out.println("The addition of" + a + "and" + b + (a+b));
}

else if(ch==2){
	System.out.println("The Multiplication of" + a + "and" + b + (a*b));
}

else if(ch==3){
	System.out.println("The Division of" + a + "and" + b + (a/b));
}

else if(ch==4){
	System.out.println("The Subtraction of" + a + "and" + b + (a-b));
}

else{
	System.out.println("Wrong Choice");
}
}
}