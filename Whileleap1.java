class Whileleap1
{
	public static void main(String[] args)
	{
		int start=1947,end=2024,temp=0,temp1=0;
		while(start<=end)
		{
			if(start%4==0 && start%100!=0||start%400==0)
			{
				temp++;
				System.out.println(start+ "  leap yr");
				if(temp%3==0)
				{
					temp1++;
					System.out.println(start +"  it is super leap yr");
				}
			}
			
		start++;
		
					
		}
		System.out.println("no.of  leap yrs=  "+temp);
		System.out.println("no.of super leap yrs=  "+temp1);
		
	}
}	