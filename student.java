class Student
{
	public static void main(String[] args)
	{
		int s1=90,s2=85,s3=80,s4=75;
		double s5=70.5;
		double totalmarks=s1+s2+s3+s4+s5;
		int maxmarks=500;
		double permarks=(totalmarks/maxmarks)*100;
		System.out.println(permarks);
	}
}