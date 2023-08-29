class Convertcase
{
	public static void main(String[] args)
	{	
			char c='a';
			int temp=(int)c,x=0;//temp=65
			if(temp<=90)
			{
				if(temp>=65)
				{
					x=temp+32;
					System.out.println(x);
				}
			}
			else
			{
				if(temp>=97)
				{
					if(temp<=122)
					{
						x=temp-32;
						System.out.println(x);
					}
				}		
			}
			
			char t=(char)x;
			System.out.println(t);
			
	
	}
}		
					
		
			