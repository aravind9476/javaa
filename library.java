class Library
{
	public static void main(String[] args)
	{
		int d=31;
		double f=0.0;
		if(d<=5)
		{
			f=(0.5)*d;
			System.out.println("fine is  "+f);
		}
		else if(d>5 && d<=10)
		{
			f=(0.5)*5+1*(d-5);
			System.out.println("fine is  "+f);
		}
		else if(d>10 && d<=30)
		{
			f=(0.5)*5+1*5+5*(d-10);
			System.out.println("fine is  "+f);
		}
		else
		{
			System.out.println("membership cancelled");
		}
	}
}
	