class Salary 
{
 	public static void main(String[] args)
	{
		String empname="aravind";
		String empid="rasamadk";
		int workingdays=22;
		int absentdays=10;
		int totalsalary=8740;
		int empworkingdays=workingdays-absentdays;
		int empperdaysalary=totalsalary/empworkingdays;
		System.out.println("employeename="+empname);
		System.out.println("employeeid="+empid);
		System.out.println("totalsalary="+totalsalary);
		System.out.println("empworkingdays="+empworkingdays);
		System.out.println("empperdaysalary="+empperdaysalary);
	}
}
		