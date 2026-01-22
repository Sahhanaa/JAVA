import java.util.Scanner;
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
		int searchvalue = 16;
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();  
        }
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
		
        BinarySearch bs = new BinarySearch();
        int indexvalue = bs.binarySearch(arr,searchvalue);
        System.out.println("\nIndex value:"+indexvalue);
	}	
		
	public int binarySearch(int[] arr, int searchvalue)
    {
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
   
        while(left <= right)
        {
            if(searchvalue == arr[mid])
            {
                return mid;
            } else if(searchvalue > arr[mid])
            {
                left = mid+1;
            } else if(searchvalue < arr[mid])
            {
                right = mid-1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
}