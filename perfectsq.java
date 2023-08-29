class Persq
{
	public static void main(String[] args)
	{
		int x=36;
		double y=Math.sqrt(x);
		if(y==(int)y)//if(x%y==0)
		{
			System.out.println(x+"  is a perfect square");
		}
		else
		{
			System.out.println(x+"  is not a perfect square");
		}
	}
}