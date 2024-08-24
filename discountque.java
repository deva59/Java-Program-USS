import java.util.*;
class bill  {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the bill value: ");
	double billValue = s.nextDouble();
	double discount = 0.0;
	double totalPayable = billValue;
if (billValue < 1000) {
	discount = billValue * 0.1;
	 totalPayable = billValue - discount;
	 }
	 System.out.println(discount);
	 System.out.println(totalPayable);

       
    }
}
