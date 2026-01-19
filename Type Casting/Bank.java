import java.util.Scanner;
class Bank
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		double balance=5000.508;
		float withdrawal;
		System.out.print("Enter the withdrawel amount:");
		withdrawal=sc.nextFloat();
		
		int withdrawal2 = (int)withdrawal;
        balance = balance - withdrawal2;
        System.out.println("Balance after proper casting(final balance):" + balance);
		
		
		double withdrawal3 = withdrawal;
        balance = balance - withdrawal3;
        System.out.println("Balance after wrong casting(final balance): " + balance);
	}
}