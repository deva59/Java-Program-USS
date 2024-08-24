class bill1{	
	public static void main(String[]args){
        double disc=50;
	double billvalue=800;
	double totalBill;
	
if(billvalue>1000)
{
	disc=billvalue*0.1;
	totalBill=billvalue-disc;
	System.out.println("\t\tBillvallue="+billvalue);
	System.out.println("\t\tdiscount="+disc);
	System.out.println("\t\tTotalBill="+totalBill);
}
else
{
	disc=billvalue*0.1;
	totalBill=billvalue-disc;
	System.out.println("\t\tBillvallue="+billvalue);
	System.out.println("\t\tdiscount="+disc);
	System.out.println("\t\tTotalBill="+totalBill);
}
}
}
	