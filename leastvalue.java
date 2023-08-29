class Leastvalue
{
	public static void main(String[] args)
	{
		int a=205,b=3009,c=100;
		if(a<b)
		{
			int x;
			x=a;//x=205
			a=b;//a=3009
			b=x;//b=205
			
		}
		if(a<c)
		{	
			int x;//a=
			x=c;//x=100
			c=a;//c=205
			a=x;//a=100
		}
		if(b<c)
		{
			int x;//
			x=b;//x=3009
			b=c;//b=100
			c=x;//c=3009
			
		
		
		}
			
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
		