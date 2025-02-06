import java.util.Scanner;

class Tip
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the bill : ");
		float bill = sc.nextFloat();
		System.out.print("Enter the TipRate : ");
		float tipRate = sc.nextFloat();

		//float tipAmmount =(tipRate/100)*bill;
		float tipAmmount = (tipRate*bill)/100;

		System.out.println("Tip Ammount : "+tipAmmount);

		float total = tipAmmount + bill;
		System.out.println("Total bill : "+total);

	}
}
