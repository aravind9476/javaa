class Cintrest
{
	public static void main(String[] args)
	{
		int p=15000,r=2,t=5;
		double x=(1+(r/100.0));
		double y=Math.pow(x,t);
		double a=p*y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		x=(int)x;
		System.out.println(x);
		y=(int)y;
		System.out.println(y);
		a=(int)a;
		System.out.println(a);
	}
}