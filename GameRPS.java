import java.util.Scanner;
class GameRPS 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);


		int randomNum=0;
		for (; ; )
		{
			int num = (int)(Math.random()*10);
			if (num>=1 && num<=3)
			{
				randomNum = num;
				//System.out.println(num);
				break;
			}
		}

		String bot = null ;

		if (randomNum==1)
		{
			bot ="Stone";
		}
		if (randomNum==2)
		{
			bot="Paper";
		}
		if (randomNum==3)
		{
			bot="Sicssor";
		}


		System.out.println("	Welcome     ");
		System.out.println();
		System.out.println("Enter the option : ");
		System.out.println();
		System.out.println("1. Stone");
		System.out.println("2. Paper");
		System.out.println("3. Sicssor");
		System.out.println();

		String user = null;
		int userOpt = sc.nextInt();
		System.out.println();


		if (userOpt==1)
		{
			user="Stone";
		}
		if (userOpt==2)
		{
			user="Paper";
		}
		if (userOpt==3)
		{
			user="Sicssor";
		}

		if ((userOpt==1 && randomNum==3) || (userOpt==2 && randomNum==1) || (userOpt==3 && randomNum==2))
		{
			System.out.println("User Win");
		}
		else if ((userOpt==1 && randomNum==2) || (userOpt==2 && randomNum==3) || (userOpt==3 && randomNum==1))
		{
			System.out.println("Bot Win");
		}
		else
			System.out.println("Draw");

		System.out.println("User Enter : "+user);
		System.out.println("Bot Enter : "+bot);
	}
}
