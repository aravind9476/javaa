class  Sandeept
{
	public static void main(String[] args)
	{
		int pdt1=1600;
		int pdt2=2050;
		int pdt3=1000;
		int totalprice=pdt1+pdt2+pdt3;
		double discount=0.0;
		double discount1=15.0/100*totalprice;
		double discount2=3.0/100*totalprice;
		double discount3=5.0/100*totalprice;
		double discount4=2.0/100*totalprice;
		System.out.println((totalprice>4000)?((pdt1>1500)?discount1:discount2):((pdt2>300)?discount3:discount4));
	}
}