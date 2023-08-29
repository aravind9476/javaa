class Least
{
	public static void main(String[] args)
	{
		int a=20,b=10,c=6;
		if(c>a)
		{
			c=c+a;
			a=c-a;
			c=c-a;
		}
		if(c>b)
		{
			c=c+b;
			b=c-b;
			c=c-b;
		}
		if(b>a)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println(a+"  "+b+"  "+c);
	}
}