import java.util.Scanner;
class CountAllTypes
{
		Scanner sc=new Scanner(System.in);
		int choise;
		int count;
	
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
	
	void countPosNum()
	{
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
			count++;
			}
		}
		System.out.println("Positive numbers count:"+count);
	}
	
	void countNegNum()
	{
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
			count++;
			}
		}
		System.out.println("Nagative numbers count:"+count);
	}
	
	void countZero()
	{
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
			count++;
			}
		}
		System.out.println("Numbers equal to zeros:"+count);
	}
	
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int choise;
	CountAllTypes cat=new CountAllTypes();
	
	
	
		do
		{
			System.out.println("---------MENU--------");
			System.out.println("1.Enter numbers:");
			System.out.println("2.Display numbers:");
			System.out.println("3.Count positive numbers:");
			System.out.println("4.Count negative numbers:");
			System.out.println("5.Count zeros:");
			System.out.println("6.Exit...");
			System.out.print("Enter your choise:");
			choise=sc.nextInt();
			
			switch(choise)
			{
				case 1:
				{
 					cat.enterNumbers();
					break;
				}
				case 2:
				{
					cat.display();
					break;
				}
				case 3:
				{
				    cat.countPosNum();
					break;
				}
				case 4:
				{
				   cat.countNegNum();
					break;
				}
				case 5:
				{
				    cat.countZero();
					break;
				}
				default:
				{
					System.out.print("EXIT...");
				}
			}
			
		}while(choise!=6);
	}
	
}

























