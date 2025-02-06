class Calci 
{
	public static void main(String[] args) 
	{
		int months = 35;
		int years = months/12;
		int mnt= months%12;

		String str = years +"."+mnt;
		float con =Float.parseFloat(str);
		System.out.println(con);
		System.out.println(years+"."+mnt);

		

	}
}
