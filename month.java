class Month
{
	public static void main(String[] args)
	{
		String x="feb";
		int no_of_days=0;
		if(x=="january"||x=="march"||x=="may"||x=="july"||x=="august"||x=="oct"||x=="dec")
		{
			no_of_days=31;
			System.out.println(no_of_days);
		}
		else if(x=="june"||x=="april"||x=="sep"||x=="nov")
		{
			no_of_days=30;
			System.out.println(no_of_days);
		}
		else
		{
			no_of_days=28;
			System.out.println(no_of_days);
		}
	}
}		