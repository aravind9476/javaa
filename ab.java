class Ab
{
	public static void main(String[] args)
	{
		int A=65;
		int B=44;
		if(A>=55 && B>=55)
		{
			System.out.println("passed");
		}
		else if(A<55)
		{
			if(A>=45 && B>=55)
			{
				System.out.println("passed");
			}
			else
			{
				System.out.println("failed");
			}
		}
		else if(A>=65 && B<45)
		{
			System.out.println(" reappear exam B");
		}
		else
		{
			System.out.println("failed");
		}
	}	
}
		