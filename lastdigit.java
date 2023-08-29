class Lastdigit
{
	public static void main(String[] args)
	{
		int n=25;
		double lastdigit=n%10;

		if(lastdigit%2==0)
		{
			System.out.println(lastdigit +" is even");
		}
		else
		{
			System.out.println(lastdigit +"  is odd");
		}
		
	}
}