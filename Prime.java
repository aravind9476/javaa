class Prime
{
	public static void main(String[] args)
	{
		int start=3,end=1,num=start,count=0;
		while(start>=end)//1//2//3
		{
			if(num%start==0)
			{
				count++;//1//2
			}
			start--;//2//3
		}
		if(count==2)
		{
			System.out.println("it is a prime no.");
		}
		else
			System.out.println("it is not a prime no.");
	}
}