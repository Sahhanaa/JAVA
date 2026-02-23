import java.util.Scanner;
class Calculator<T extends Number>
 {
    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
public class GenericMains
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator<Double> calc = new Calculator<>();
        int choice;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                System.out.println("Result: " + calc.add(a, b));
            }
            else if (choice == 2) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                System.out.println("Result: " + calc.subtract(a, b));
            }

        } while (choice != 3);

        sc.close();
    }
}