class Whileleap
{
	public static void main(String[] args)
	{
		int start=1947,end=2024,leapcount=0, nleapcount=0;
		while(start<=end)
		{
			if(start%4==0 && start%100!=0||start%400==0)
			{
				leapcount++;
				System.out.println( start + " -  it is aleap yr");
			}
			else
			{
				nleapcount++;
				System.out.println(start +" - it is not a leap yr");
			}
		start++;
		
					
		}
		System.out.println("no. of leap years = "+leapcount);
		System.out.println("no.of non leap years = "+nleapcount);
	}
}	