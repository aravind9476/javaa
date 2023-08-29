class Consonant
{
	public static void main(String[] args)
	{
		char temp='H';
		int t=(int)temp;
		int n=18;
		if(n>=0 && n<=9)
			System.out.println("it is a number");
		else
			System.out.println("it is not a number");
		if(temp>=65 && temp<=90)
		{
			if(temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
			{
				System.out.println("it is a capital vowel");
			}
			else
				System.out.println("it is a capital consonant");
		}
		else if(temp>=97 && temp<=122)
		{
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
				System.out.println("it is a small vowel");
			else
				System.out.println("it is a small consonant");
		}
		else
			System.out.println("it is a symbol");
	}
}
