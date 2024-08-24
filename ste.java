import java.util.*;
class ste{
	public static void main(String args[]){
	int a,b;
	System.out.println("1.add \n2.sub \n3.mul \n.div");
	System.out.println("Enter a choice");

	Scanner s= new Scanner(System.in);
 	a=s.nextInt();
        b=s.nextInt();
	System.out.println("Enter a two number");
	
	switch(n){

	case 1:
	System.out.println("the addtion of" + a + "and"+ b + (a+b));
	break;
	

	case 2:
	System.out.println("the subtraction of" + a + "and"+ b + (a-b));
	break;
	

	case 3:
	System.out.println("the multiplication of" + a + "and"+ b + (a*b));
	break;
	

	case 4:
	System.out.println("the division of" + a + "and"+ b + (a/b));
	break;
		
	default:
	System.out.println("wrong choice");
	break;
	

}
}
}

