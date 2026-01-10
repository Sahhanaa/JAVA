import java.util.Scanner;
class ReverseArray
{
		Scanner sc=new Scanner(System.in);
		int choise;
	
	int arr[]=new int[10];
	
	void enterNumbers()
	{
	for(int i=0;i<arr.length;i++)
		{
           System.out.print("Enter the "+ (i+1) +" number:");
		   arr[i]=sc.nextInt();
		}
	
	}
	
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
		   System.out.println(arr[i]+" ");
		}
	}
	
	void reverseDisplay()
	{
		for(int i=arr.length-1;i>=0;i--)
		{
		   System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int choise;
	ReverseArray ra=new ReverseArray();
	
	
		do
		{
			System.out.println("---------MENU--------");
			System.out.println("1.ENTER THE NUMBERS");
			System.out.println("2.DISPLAY THE NUMBERS:");
			System.out.println("3.DISPLAY THE NUMBERS IN REVERSE ORDER:");
			System.out.println("4.EXIT...");
			System.out.print("Enter your choise:");
			choise=sc.nextInt();
			
			switch(choise)
			{
				case 1:
				{
 					ra.enterNumbers();
					break;
				}
				case 2:
				{
					ra.display();
					break;
				}
				case 3:
				{
					ra.reverseDisplay();
					break;
				}
				default:
				{
					System.out.print("EXIT...");
				}
			}
			
		}while(choise!=4);
	}
	
}

























