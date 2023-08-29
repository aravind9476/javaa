class Policy
{
	public static void main(String[] args)
	{
		String health="poor",gender="male",live="village";
		int age=30,policyamount=10000;
		double premium=0,max_amount=0;
		if(health=="excellent" && age<=35 && age>=25 && live=="city" && policyamount<=200000 && gender=="male")
		{
			premium=4*policyamount/1000;
			System.out.println(premium);
			max_amount=4*200000/1000;
		}
		else if(health=="excellent" && age<=35 && age>=25 && live=="city" && policyamount<=100000 && gender=="female")
		{
			
			premium=3*policyamount/1000;
			System.out.println( gender +"  "+premium);
			max_amount=3*100000/1000;
		}
		else if(health=="poor" && age<=35 && age>=25 && live=="village" && policyamount<=10000 && gender=="male")
		{
			premium=6*policyamount/1000;
			System.out.println(premium);
			max_amount=6*10000/1000;
		}
		else
		{
			System.out.println("no policy");
		}
		
		System.out.println(premium +"  "+ max_amount);
	}
}		