import java.util.Scanner;
class Box<T> {
    T value;
	
    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box<Object> box = new Box<>();
        int choice;

        do {
            System.out.println("\n1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Integer: ");
                int num = sc.nextInt();
                box.set(num);
            }
            else if (choice == 2) {
                System.out.print("Enter String: ");
                sc.nextLine(); // clear buffer
                String str = sc.nextLine();
                box.set(str);
            }
            else if (choice == 3) {
                System.out.println("Stored Value: " + box.get());
            }

        } while (choice != 4);

        sc.close();
    }
}