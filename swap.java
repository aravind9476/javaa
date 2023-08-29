class Swap
{
	public static void main(String[] args)
	{
		int x=1,y=2,z;
		if(x>y)
		{
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println(x+"  "+y);
		}
		else
		{
			x=x*y;
			y=x/y;
			x=x/y;
			System.out.println(x+"  "+y);
		}
	}
}