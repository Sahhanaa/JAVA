class RankingSystem
{
	public static void main(String[] args)
	{
		long ps=36l;
		double tt=2;
		double rs=ps/tt;
		System.out.println("Rank is"+rs);
		
		//worng casting
		long rank=ps/(long)tt;
		System.out.println("Time taken is:"+rank);
		
		//correct casting
		int ps1=20;
		ps=ps1;
		System.out.println("Player score is:"+ps1);
		
 	}
}