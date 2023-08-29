class Order
{
	public static void main(String[] args)
	{
		String app="amazon";
		String select1="men",select2="women",Select3="kids";
		System.out.println("select="+select1);
		String item="underarmourshoe";
		String colour="black";
		int size=10;
		int actualprice=5999;
		System.out.println("actualprice="+actualprice);
		double discount=(15.0/100)*actualprice;
		double price1=actualprice-discount;
		System.out.println("priceafterdiscount="+price1);
		double bankoffer=(7.5/100)*price1;
		System.out.println("bankoffer="+bankoffer);
		double price2=price1-bankoffer;
		System.out.println("price2="+price2);
		double deliveryfee=5;
		double maxprice=price2-deliveryfee;
		System.out.println("maxprice="+maxprice);
	}
}
		
		
		