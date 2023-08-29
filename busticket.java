class Ticket
{
	public static void main(String[] args)
	{
		String transport="RedbusTSRTC-001";
		String sourcelocation="hyd";
		String destination="knr";
		String pickupdate1="30aug",pickupdate2="18aug";
		int actualprice=690;
		double discount=(16.0/100)*actualprice;
		double coupen=100;
		int tax=5;
		int gst=5;
		double ticketprice=actualprice-discount-coupen+tax+gst;
		System.out.println("transportname="+transport);
		System.out.println("sourcelocation="+sourcelocation);
		System.out.println("destination="+destination);
		System.out.println("pickupdate="+pickupdate2);
		System.out.println("actualprice="+actualprice);
		System.out.println("ticketprice="+ticketprice);
	}
}
		
		
		