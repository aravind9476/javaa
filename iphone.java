class Iphone
{
	public static void main(String[] args)
	{
		String name="appleiphone14";
		int price=79900,packagefee=99;
		double discount=(14.0/100)*price;
		System.out.println(discount);
		double totalprice=price-discount+packagefee;
		System.out.println(totalprice);
		double price1=totalprice-4000;
		System.out.println(price1);
		double price2=totalprice-11901;
		System.out.println(price2);
		double discount1=(5.0/100)*totalprice;
		double offerprice=totalprice-discount1;
		System.out.println(offerprice);
		int exchange=7000;
		double tprice=offerprice-exchange;
		System.out.println(tprice);
	}
}
		