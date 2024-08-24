import java.util.*;
class div{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = s.nextInt();
	if( n % 6==0 && n % 12==0){
	   System.out.println(n+"Its Completly devide by 6 and 9");
	}else{
	   System.out.println(n+"Is not Completly devide by 6 and 9");
	}
}
}