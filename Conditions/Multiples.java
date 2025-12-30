import java.util.Scanner;
class Multiples
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter the number:");
			int num=sc.nextInt();
			
			if((num%3==0)||(num%7==0))
			{
				System.out.println("Multiples of 3 and 7");
			}
			else
			{
				System.out.println("Not a multiple of 3 and 7");
			}
		}
	}
}