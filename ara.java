class Ara
{
	public static void main(String[] args)
	{
		int a=12;
		int b=15, c;
		System.out.println("BEFORE SWAPPING  "+a +" "+b);
		c=b;
		b=a;
		a=c;
		System.out.println("AFTER SWAPPING  "+a +" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping  " +a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("afetrswapping   "+a+" "+b);
	}
}