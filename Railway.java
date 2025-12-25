import java.util.Scanner;
class Railway
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
System.out.print("Choose your option : ");
int num = sc.nextInt();
switch(num)
{
case 1:
System.out.print("General class and ticket rate is 2000");
break;
case 2:
System.out.print("Sleeper class and ticket rate is 3000");
break;
case 3:
System.out.print("AC 2 Tier class and ticket rate is 4000");
break;
case 4:
System.out.print("AC 2 Tier class and ticket rate is 5000");
break;
case 5:
System.out.print("First class and ticket rate is 6000");
break;
default:
System.out.print("Invalid tickets");
}
}
}
}