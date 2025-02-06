class Speed 
{
	public static void main(String[] args) 
	{

		final double runs = 14/1.6;  // miles convertion
		final float time =  (60*45)+30;  // seconds   2730
		
		System.out.println("Miles : "+runs);
		System.out.println("Time needed in Hrs : "+time/3600);     // time by per hour

		// Average speed = d/t

		double avgSpeed = runs/(time/3600);
		System.out.println("Speed : "+avgSpeed);


		//double miles = 14/1.6;
		//System.out.println(miles);
		//double milesHrs = miles/time;
		//System.out.println(milesHrs);


		System.out.println("Avgerage Speed is : "+ avgSpeed +" mph" );
	}
}
