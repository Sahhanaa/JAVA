class CharMulti
{
	public static void main(String[] args)
	{
		char ar[][] = {{'V','I','J','A','Y'},{'A','J','I','T','H'},{'K','A','M','A','L'},{'S','I','M','B','U'}};
		
		for(int i =0;i<ar.length;i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + "  ");
			}
			
				System.out.println("");
			
		}
	}
}