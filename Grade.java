import java.util.Scanner;
class Grade
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
System.out.print("Choose your option : ");
char grade = sc.next().charAt(0);
switch(grade)
{
case 'A':
System.out.print("Great");
break;
case 'B':
System.out.print("Good");
break;
case 'C':
System.out.print("Nice");
break;
case 'D':
System.out.print("Okkk");
break;
case 'F':
System.out.print("Not nice");
break;
default:
System.out.print("Invalid day");
}
}
}
}