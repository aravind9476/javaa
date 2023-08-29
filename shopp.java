class Shopp
{
	public static void main(String[] args)
	{
		String a="smartwatch";
		String colour="black";
		String b="spects";
		int price1=1500;
		int price2=600;
		int totalprice=price1+price2;
		double maxprice;
		int deliveryfee=5;
		int gst=12;
		int packagingfee=20;
		if(totalprice>2000)
		{
			double discount=(10.0/100)*totalprice;
			System.out.println(discount);
			maxprice=totalprice-discount;
			System.out.println("price after discount  "+maxprice);
		}
		else
		{
			double discount=(5.0/100)*totalprice;
			maxprice=totalprice-discount;
			System.out.println("price after discount  "+maxprice);
		}
		double bill=maxprice+deliveryfee+gst+packagingfee;
		System.out.println(bill);
		
	}
}

		
