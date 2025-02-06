class Census 
{
	public static void main(String[] args) 
	{
		long currentPopulation = 312032486;
		final long seconds = (365*24*60*60)*5;

		System.out.println("Total Seconds In 5 year : "+seconds);

		long birth = seconds/7;
		long death = seconds/13;
		long immigrant = seconds/45;

		long totalPopulation = currentPopulation + birth - death + immigrant;

		System.out.println("Current Population : "+currentPopulation);
		System.out.println("Total Population after 5 years :" + totalPopulation);
	}
}
