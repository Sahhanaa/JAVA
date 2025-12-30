import java.util.Scanner;
class ElectricityBills
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter the units:");
			int units=sc.nextInt();
			
				if(units>0&&units<=100)
				{
					System.out.println("Electricity bill:"+(units*5));
				}
				else if(units>=101&&units<200)
				{
					System.out.println("Electricity bill:"+(units*7));
				}
				else if(units>=200)
				{
					System.out.println("Electricity bill:"+(units*10));
				}
                else
				{
					System.out.println("Invalid units");
				}
		}
	}
}