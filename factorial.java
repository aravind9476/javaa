class factorial
{
	public static void main(String[] args)
	{
		int x=7,mul=1;
		while(x>=1)
		{
			mul=x*mul;
			x--;
		}
		System.out.println(mul);
	}
}