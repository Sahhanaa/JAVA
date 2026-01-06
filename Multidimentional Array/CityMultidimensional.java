import java.util.Scanner;
class CityMultidimensional
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Row value :: ");
		int row = sc.nextInt();
		System.out.print("Enter the Column value :: ");
		int col = sc.nextInt();
		
		String a[][] = new String [row][col];
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print("Enter the value of "+ i +","+ j +" index :: ");
				a[i][j]= sc1.nextLine();
			}
		}
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ "  ");
			}
				System.out.println("");
		}
	}
}