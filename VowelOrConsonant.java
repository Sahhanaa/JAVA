import java.util.Scanner;
class VowelOrConsonant
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
System.out.print("Choose your option : ");
char num = sc.next().charAt(0);
switch(num)
{
case 'a':
System.out.print("a is vowel");
break;
case 'e':
System.out.print("e is vowel");
break;
case 'i':
System.out.print("i is vowel");
break;
case 'o':
System.out.print("o is vowel");
break;
case 'u':
System.out.print("u is vowel");
default:
System.out.print("Invalid");
}
}
}
}