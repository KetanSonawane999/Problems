import java.util.Scanner;

class BodyMassIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in kgs: ");
		final float weight = sc.nextFloat();
		System.out.println("Enter Height : ");
		final float height = sc.nextFloat();

		double weightPounds = weight * 0.45359237;     // converts it in pounds
		double heightInch = height * 0.0254;           // coverts it in inch

		double bmi = weightPounds / (heightInch*heightInch);
		System.out.println("BMI is : "+bmi);
		
		//System.out.println(weight);
		//System.out.println(height);

	}
}
