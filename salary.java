class Salary 
{
 	public static void main(String[] args)
	{
		String empname="aravind";
		String empid="rasamadk";
		int workingdays=22;
		int absentdays=12;
		double totalsalary=8740;
		double empworkingdays=workingdays-absentdays;
		double empperdaysalary=totalsalary/empworkingdays;
		System.out.println("employeename="+empname);
		System.out.println("employeeid="+empid);
		System.out.println("totalsalary="+totalsalary);
		System.out.println("empworkingdays="+empworkingdays);
		System.out.println("empperdaysalary="+empperdaysalary);
	}
}
		