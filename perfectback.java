class Perfectback
{
	public static void main(String[] args)
	{
		int num=28,var=num-1,sum=0;
		int start=1;
		while(var>=start)//5
		{
			if(num%var==0)
			{
				sum+=var;
			}
			var--;
		}
		
		if(sum==num)
		{
			System.out.println("perfect");
		}
		else
			System.out.println("not perfect");
	}
}
			