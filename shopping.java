class Shopping
{
	public static void main(String args[])
	{
		String item="jeanspant";
		String itemcolour1="black",itemcolour2="blue";
		double size=28;
		double originalcost=400;
		double discount=(5.0/100)*originalcost;
		String paymentmode="cash";
		double coupon=50;
		double deliveryfee=5;
		double cost=originalcost-discount-coupon+deliveryfee;
		System.out.println("itemcolour="+itemcolour1);
		System.out.println("cost="+cost);
	}

}