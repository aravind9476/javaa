class Root
{
	public static void main(String[] args)
	{
		int a=2,b=3,c=1;
		double x=Math.pow(b,2);//9
		double z=(-b+Math.sqrt(x-4*a*c))/(2*a);
		System.out.println(z);
		double y=(-b-Math.sqrt(x-4*a*c))/(2*a);
		System.out.println(y);
	}
}