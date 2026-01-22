import java.util.Scanner;
class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        int serachElement;

        System.out.println("Enter 5 elements:");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        serachElement = sc.nextInt();

        int pos = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == serachElement)
            {
                pos = i;
                break;
            }
        }
        if(pos != -1)
            System.out.println("Element found at index " + pos);
        else
            System.out.println("Element not found");
    }
}