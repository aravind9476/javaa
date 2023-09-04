class Perfect
{
	public static void main(String[] args)
	{
		int start=1,end=28,sum=0;
		while(start<end)//
		{
			if(end%start==0)
			{
				sum=sum+start;
			}
			start++;
		}
		if(sum==end)
			System.out.println("it is a perfect no.");
		else
			System.out.println("it is not a perfect no.");
	}
}