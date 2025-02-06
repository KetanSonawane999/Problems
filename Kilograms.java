import java.util.Scanner;

class Kilograms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Pound value : ");
		float pound = sc.nextFloat();
		System.out.println("Pounds : "+pound);

		double value = 0.453592;

		double kg = pound * value;
		System.out.println(kg);

		System.out.println("Pounds is : "+pound+" and in Kilogram is : "+kg);


	}
}
