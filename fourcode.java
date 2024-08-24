circumference of a circle

import java.util.*;
class cir
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		double pi=31.4,r,circumfarance_of_circle;
			System.out.println("Enter the radius of circle=");
			
			r=x.nextDouble();
			circumfarance_of_circle=(2*pi*r)/100;
			System.out.println("circumfarance_of_circle="+circumfarance_of_circle);
	}
}




area of a circle

import java.util.*;
class its
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		double pi=31.4, r,area_of_circle;
			System.out.println("Enter radius of circle=");
			r=x.nextDouble();
			area_of_circle=pi*r*r;
			System.out.println("The area of circle is="+area_of_circle);
	}
}





simple interest


import java.util.*;
class si
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		double p,t,r,si;
			System.out.println("Enter the principle=");
			p=x.nextDouble();
			System.out.println("Enter the time=");
			t=x.nextDouble();
			System.out.println("Enter the rate=");
			r=x.nextDouble();
			si=(p*t*r)/100;
			System.out.println("si="+si);
	}
}


area of triangle

import java.util.*;
class tri
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

