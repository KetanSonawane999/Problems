import java.util.Scanner;

class Years 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Minutes : ");
		long minute = sc.nextLong();
		System.out.println("Total minutes : "+minute);

		int minYear = 365*24*60;

		int minDay = 24*60;
	

		long years = minute/minYear;

		long days = minute/minDay;

		long remainDays = (minute%minYear)/(24*60);


		System.out.println("Minutes in years : "+minYear);
		System.out.println("Total years : "+years);
		System.out.println("Total Days : "+days);
		System.out.println("Remaining days : "+remainDays);
		System.out.println("years : "+years+" days : "+remainDays);



	/*	long years = minute/(365*24*60);
		System.out.println("Total year requied : "+years);

		long totalDays =minute/(24*60);
		System.out.println("Total Days : "+totalDays);
		
		long days = (minute/(24*60))%365;
		//long days = (minute/24/60)%365;
		System.out.println("Days before 365 days : "+days);	*/


		//System.out.println(minute+" minutes is approx "+ years+" years and days "+days);

	}
}
