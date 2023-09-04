class Naturalno
{
	public static void main(String[] args)
	{
		int start=10,end=1,sum=0;
		while(start>=end)
		{
			sum=sum+start;
			System.out.println(start);
			start--;
		}
		System.out.println(sum);
	}
}