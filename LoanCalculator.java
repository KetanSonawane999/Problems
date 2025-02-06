import java.util.Scanner;

class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("	 Loan Calculator		");
		System.out.println();
		System.out.println("Enter the Amount : ");
		float amount = sc.nextFloat();
		System.out.println();
		System.out.println("Enter the ROI : ");
		float roi = sc.nextFloat();
		System.out.println();
		System.out.println("Enter the tenure (Months) : ");
		int months = sc.nextInt();
		System.out.println();

		String str = (months/12)+"."+(months%12);
		float con = Float.parseFloat(str);

		System.out.println("amount : "+amount);
		System.out.println("roi : "+roi);
		System.out.println("months : "+con);

		float intrestYear = amount*roi/100;
		System.out.println("intrest : "+intrestYear);

		float intrest = intrestYear*con;
		System.out.println("Total Intrest : "+intrest);

		float totalAmount = intrest+amount;
		System.out.println("Total Amount : "+ totalAmount);

		float emi = totalAmount/months;
		System.out.println("Emi : "+emi+" rs");
	}
}
