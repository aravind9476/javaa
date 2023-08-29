class Marks
{
	public static void main(String[] args)
	{
		String name="ara";
		char section='A';
		String grade="";
		int donation=0;
		int scholorship=0;
		int s1=70,s2=50,s3=65,s4=90,s5=85,s6=96;
		int total=s1+s2+s3+s4+s5+s6;
		double maxmarks=600;
		double per=(total/maxmarks)*100;
		System.out.println("per is  "+per);
		if(per>=80)
		{
			section='A';
			donation=5000;
			scholorship=10000;
			grade="distinction";
		}
		else if(per<80)
		{
			section='b';
			donation=50000;
			scholorship=50000;
			grade="fail";
		}
		else
		{
			System.out.println("SKIPPED SCHOOL");
		}
		System.out.println(per+"  "+section+"   "+donation+"   "+scholorship+"  "+grade);
	}
}	