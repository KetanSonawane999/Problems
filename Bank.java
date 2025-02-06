import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{

		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0l;
		double balance = 0.0;
		Scanner sc = new Scanner (System.in);

		completeLoop:
		for (; ; )
		{
			System.out.println("            *** WELCOME ***		");
			System.out.println("      *** LAXMI BANK COPRATIVE ***		");
			System.out.println();
			System.out.println("1. LOGIN ");
			System.out.println("2. CREATE ACCOUNT ");
			System.out.println();
			System.out.print("Enter Option : ");
			int opt = sc.nextInt();

		
			if (opt==1)
			{
				if (username1==null)
			{
				System.out.println();
				System.out.println("CREATE YOUR ACCOUNT FIRST" );
				System.out.println();
				continue;
			}


				System.out.println();
				System.out.println("    *** LOGIN ***    ");
				System.out.println();

				verification:
				for (int i=3; i>=1 ;i-- )
				{
					System.out.println();
					System.out.println("Enter Username : ");
					String username = sc.next();
					System.out.println("Enter Password : ");
					String password = sc.next();
					System.out.println();
					if (username.equals(username1) && password.equals(password1))
					{
						
						home:
						for (; ; )
						{
							System.out.println();
							System.out.println("      *** HOME PAGE ***    ");
							System.out.println();
							System.out.println("1. DEPOSITE");
							System.out.println("2. WITHDRAW");
							System.out.println("3. CHECK BALANCE");
							System.out.println("4. MINI STATEMENT");
							System.out.println("5. LOGOUT");
							System.out.println();
							System.out.println("ENTER THE OPTION : ");
							int opt1 = sc.nextInt();
							System.out.println();

							switch (opt1)
							{
							case 1:{
								System.out.println("Deposite");
								System.out.println();
								System.out.println("Enter Amount : ");
								double depositeAmt = sc.nextDouble();
								System.out.println();
								balance += depositeAmt;
								System.out.println("Amount Deposited Sucess");
								System.out.println();
								break;
							}

							case 2:{
								System.out.println("WITHDRAW");
								System.out.println();
								System.out.println("Enter Amount to Withdraw : ");
								double withdraw = sc.nextDouble();
								System.out.println("enter pin : ");
								String password3 = sc.next();
								System.out.println();

								for (int k=3; k>=1 ;k-- )
								{
									if (password3.equals(password1))
									{
										if (withdraw<=balance)
										{
											balance -= withdraw;
											System.out.println("Amount Debited Success");
											continue home;
										}
										else
										{
											System.out.println("Insufficient Balance");	
										}
									}
									else
									{
										System.out.println("Wrong pin ");
										System.out.println("Attempt remain : "+(k-1));
									}
									break;
									}
								
							}

							case 3:{
								System.out.println("Check Balance ");
								System.out.println();
								
								for (int j=3; j>=1; j-- )
								{
									System.out.print("enter pin :");
									String password2 = sc.next();

									if (password2.equals(password1))
									{
										System.out.println("Account Balance  : "+ balance+" rs");
										continue home;
									}
									else
									{
										System.out.println("Wrong Pin");
										System.out.println("Attempt remain : "+(j-1));
									}
								}
								System.out.println("Your Account has been bloacked for 24 hours");
								System.exit(0);
	
							}

							case 4:{
								System.out.println("MINI STSTEMENT ");
								break;
							}

							case 5:{
								System.out.println("Thank You Visit Again");
								System.exit(0);
							}
							}
						}
						//System.out.println(" Successfully Login");
					}
					else
					{
						System.out.println("Wrong Pin");
						System.out.println("Attempt Remain : "+ (i-1));
					}
				}
				System.out.println("Never Visit Again");
				System.exit(0);
				
				
			}

			else if (opt==2)
			{
				System.out.println("CREATE THE BANK ACCOUNT");
				System.out.println();
				System.out.println("Username : ");
				username1 = sc.next();
				System.out.println("Password : ");
				password1 = sc.next();
				sc.nextLine();
				System.out.println("Address : ");
				address = sc.nextLine();
				System.out.println("Contact : ");
				contact = sc.nextLong();
				System.out.println("Deposite the amount : ");
				balance = sc.nextDouble();
				System.out.println();
				System.out.println("Account Created Success");

			}
			else
			{
				System.out.println("Invalid Option");
			}
				
		}

	}		
}
