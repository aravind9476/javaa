class factors
{
	public static void main(String[] args)
	{
		
		int n1=50,n2=100,temp=0,temp1=0;
		int start=1;
		while(start<=20)
		{
			if(n1%start==0)
			{
				temp++;
				System.out.println("n1 factor  "+start);
			}
			if(n2%start==0)
			{
				temp1++;
				System.out.println("n2 factor  "+start);
			}
			start++;
		}
		System.out.println("no.of n1 factors is "+temp);	
		System.out.println("no.of n2 factors is "+temp1);
	}	
}
