class Ifemploy
{
	public static void main(String[] args)
	{
		String emp="aravind";
		int basicsalary=10000;
		double pf,tax;
		double ta=15.0/100*basicsalary;
		double da=12.0/100*basicsalary;
		double hra=19.0/100*basicsalary;
		double totalsalary=basicsalary+ta+da+hra;
		System.out.println("totalsalary is "+totalsalary);
		if(totalsalary>16000)
		{
			pf=11.0/100*basicsalary;
			tax=5.0/100*basicsalary;
		}
		else
		{
			pf=7.0/100*basicsalary;
			tax=2.5/100*basicsalary;
		}
		double salary=totalsalary-pf-tax;
		System.out.println("pf is  "+pf);
		System.out.println("tax is  "+tax);
		System.out.println("salary is  "+salary);
		double yearsalary=salary*12;
		System.out.println("yearsalary  ="+yearsalary);
		
	}
}