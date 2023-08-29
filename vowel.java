class Vowell
{
	public static void main(String[] args)
	{
		char x='E';
		int y=(int)x;
		if(y>=65 && y<=90) 
		{
			if(y==65||y==69||y==73||y==79||y=85)
			{
				System .out.println(x+"  is capital vowel");
			}
			else
			{
				System.out.println(x+"  is capital consonant");
			}
		}
		else if(y>=97 && y<=122)
		{
			if(y==97||y==101||y==105||y==111||y==117)
			{
				System.out.println(x+"  is small vowel");
			}
			else
			{
				System.out.println(x+"  is small consonant");
		}
	}
}
		