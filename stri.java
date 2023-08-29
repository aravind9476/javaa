class Stri
{
	public static void main(String[] args)
	{
		String a="aravind";
		String b="charan";
		String c;
		c=a;
		a=b;
		b=c;
		System.out.println("afterswapping :::  "  +  a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a +"   "+b);
		
	}
}