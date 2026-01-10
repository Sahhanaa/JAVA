import java.util.Scanner;
class Result
{
	int m1,m2,m3;
	int total;
	double percentage;
	
    Scanner sc=new Scanner(System.in);
	
	void inputMarks()
	{
		System.out.print("Enter mark 1:");
		m1=sc.nextInt();
		System.out.print("Enter mark 2:");
		m2=sc.nextInt();
		System.out.print("Enter mark 3:");
		m3=sc.nextInt();
	}
	
	int calculateTotal()
	{
		total=m1+m2+m3;
		return total;
	}
	
	double calculatePercentage()
	{
		percentage=total/3.0;
		return percentage;
	}
	
	String displayResult()
	{
		if(percentage>=40)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	String displayGrade()
	{
		if(percentage>=75)
		    return "A";
		else if(percentage>=60&&percentage<74)
			return "B";
		else if(percentage>=40&&percentage<59)
			return "C";
		else if(percentage<40)
			return "D";
		else
			return "F";
	}
	
	public static void main(String [] args)
	{
		Result r=new Result();
		Scanner sc=new Scanner(System.in);
		int choise;
		
		r.inputMarks();
		
		do
		{
			System.out.println("\n1.Display total:");
			System.out.println("2.Display percentage:");
			System.out.println("3.Display result:");
			System.out.println("4.Display grade:");
			System.out.println("5.Exit");
			System.out.print("Enter your choise:");
			choise=sc.nextInt();
			
			switch(choise)
			{
				case 1:
				{
                System.out.print("Total:"+r.calculateTotal());
				break;
				}
				case 2:
				{
				System.out.print("Percentage : "+r.calculatePercentage());
				break;
				}
				case 3:
				{
				System.out.print("Result:"+r.displayResult());
				break;
				}
				case 4:
				{
			    System.out.print("Grade:"+r.displayGrade());
				break;
				}
				case 5:
				{
				System.out.print("Exiting the program.");
				break;
				}
				default:
				System.out.print("Invalid choise.");
				
			}
		}while(choise!=5);
	}
	
}
























