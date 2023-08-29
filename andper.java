class Andper
{	
	public static void main(String[] args)
	{
		String name="chintu";
		char section='A';
		char grade=' ';
		int per=50;
		if(per>=90 && per<=100)
		{
			grade='O';
		}
		else if(per>=80 && per<=90)
		{
			grade='A';
		}
		else if(per>=70 && per<=80)
		{
			grade='B';
		}
		else if(per>=60 && per<=70)
		{
			grade='C';
		}
		else
		{
			System.out.println("skipped school");
		}
		System.out.println(grade);
	}
}