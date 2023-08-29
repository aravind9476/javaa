class  Sandeep
{
	public static void main(String[] args)
	{
		int pdt1=1600;
		int pdt2=2050;
		int pdt3=1000;
		double discount=0.0;
		int totalprice=pdt1+pdt2+pdt3;
		if(totalprice>4000)
		{
			if(pdt1>1500)
			{
				discount=15.0/100*totalprice;
				System.out.println(discount);
			}
			else
			{
				discount=3.0/100*totalprice;
				System.out.println(discount);
			}
		}
		else if(totalprice<4000)
		{
			if(pdt2>300)
			{
				discount=5.0/100*totalprice;
			}
			else
			{
				discount=2.0/100*totalprice;
				
			}
		}
		
		else
		{
			System.out.println("no discount");
		}
		System.out.println(discount);	
		
	}
}
		