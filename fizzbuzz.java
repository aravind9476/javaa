class Fizzbuzz
{
	public static void main(String[] args)
		{
			int x=11;
			if(x%3==0)
			{
				if(x%5==0)
					System.out.println("FizzBuzz");
				else
				  	System.out.println("Fizz");
			}
			else if(x%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(x);
			}
		}
}
					
				
			