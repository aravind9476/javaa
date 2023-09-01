class tableeven
{
	public static void main(String[] args)
	{
		int start=1,end=10,value=1,a=7;
		while(start<=end)
		{
			if(start%5==0)
			{
				value=a*start;
				System.out.println(a+"  x   "+start+"  =  "+value);
			}
			
			start++;
		}
	}
}