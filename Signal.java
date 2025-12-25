import java.util.Scanner;
class Signal
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
System.out.print("Choose your option : ");
String signal = sc.nextLine();
switch(signal)
{
case "Red":
System.out.print("Stop");
break;
case "Yellow":
System.out.print("Get ready");
break;
case "Green":
System.out.print("Go");
break;
default:
System.out.print("Invalid signal");
}
}
}
}