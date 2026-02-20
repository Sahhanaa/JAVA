import java.util.ArrayList;
import java.util.Scanner;

class Acer {
    String model;
    String color;
    boolean rgbKeyboard;
    String processor;
    double price;

    // Constructor
    Acer(String model, String color, boolean rgbKeyboard, String processor, double price) {
        this.model = model;
        this.color = color;
        this.rgbKeyboard = rgbKeyboard;
        this.processor = processor;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Laptop name : " + model);
        System.out.println("Color of the laptop : " + color);
        System.out.println("It is rgb keyboard : " + rgbKeyboard);
        System.out.println("Processor : " + processor);
        System.out.println("Price of the Laptop : " + price);
    }
}

public class AcerManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Acer> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("1 for Entry 2 for Search");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.println("Enter the model of laptop");
                String model = sc.nextLine();

                System.out.println("Color of the laptop");
                String color = sc.nextLine();

                System.out.println("It is rgb keyboard (True/False)");
                boolean rgb = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Processor");
                String processor = sc.nextLine();

                System.out.println("Price");
                double price = sc.nextDouble();

                list.add(new Acer(model, color, rgb, processor, price));
            }

            else if (choice == 2) {
                System.out.println("Enter the laptop name");
                String searchModel = sc.nextLine();

                boolean found = false;

                for (Acer laptop : list) {
                    if (laptop.model.equalsIgnoreCase(searchModel)) {
                        laptop.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Laptop not found");
                }
            }

        } while (choice != 2);

        sc.close();
    }
}