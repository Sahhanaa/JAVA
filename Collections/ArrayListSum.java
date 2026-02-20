import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("1 for Entry 2 for Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the value");
                int value = sc.nextInt();
                list.add(value);
            }

        } while (choice != 2);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of the values you have entered " + sum);
        sc.close();
    }
}