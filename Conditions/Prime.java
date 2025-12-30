import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter the number:");
			int num=sc.nextInt();
			
			if(num<1)
			{
				System.out.println("This is not a prime number");
			}
			else if(num==2)
			{
				System.out.println("This is a prime number");
			}
			else if(num%2!=0||(num%2==1))
			{
				System.out.println("This is a prime number");
			}
			else if((num%3==1)||(num%3!=0))
			{
				System.out.println("This is a prime number");
			}
			else if((num%4==1)||(num%4!=0))
			{
				System.out.println("This is a prime number");
			}
			else if((num%5==1)||(num%5!=0))
			{
				System.out.println("This is a prime number");
			}
			else
			{
				System.out.println("This is not a prime number");
			}
		}
	}
}