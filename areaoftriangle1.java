import java.util.*;
class cirm
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		double b,h,area_of_triangle;
			System.out.println("Enter length and breadth of triangle=");
			b=x.nextDouble();
			h=x.nextDouble();
			area_of_triangle=(b*h)/2;
			System.out.println("The area of triangle is="+area_of_triangle);
	}
}