class Shop
{
	public static void main(String[] args)
	{
		String pdtname="smartwatch";
		String colour="black";
		int actualprice=29900;
		int quantity=2;
		int totalprice=quantity*actualprice;
		double discount=(9.0/100)*totalprice;
		double price=totalprice-discount;
		System.out.println("priceafterdiscount="+price);
		double bankoffer=(10.0/100)*totalprice;
		double priceafterbankoffer=price-bankoffer;
		double exchange=5000;
		double estimatedprice=priceafterbankoffer-exchange;
		System.out.println("estimatedprice="+estimatedprice);
		System.out.println("discount="+discount);
		System.out.println("bankoffer="+bankoffer);
		System.out.println("totalprice="+totalprice);
	}
}		

		