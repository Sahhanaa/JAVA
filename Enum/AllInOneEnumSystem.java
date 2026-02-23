import java.util.Scanner;
public class AllInOneEnumSystem {
 enum Signal 
{
    RED, 
	YELLOW, 
	GREEN
}
enum Day
{
MONDAY,
TUESDAY, 
WEDNESDAY, 
THURSDAY, 
FRIDAY, 
SATURDAY,
SUNDAY
}
enum OrderStatus
{
PLACED, 
SHIPPED, 
DELIVERED,
CANCELLED
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int mainChoice;
        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Traffic Signal System");
            System.out.println("2. Weekday Working System");
            System.out.println("3. Order Status Tracking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    int trafficChoice;
                    do {
                        System.out.println("\n--- Traffic Signal Menu ---");
                        System.out.println("1. Show Signal Meaning");
                        System.out.println("2. Check Stop or Go");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        trafficChoice = sc.nextInt();
                        switch (trafficChoice) {
                            case 1:
                                for (Signal s : Signal.values()) {
                                    switch (s) {
                                        case RED:
                                            System.out.println("RED - Stop");
                                            break;
                                        case YELLOW:
                                            System.out.println("YELLOW - Get Ready");
                                            break;
                                        case GREEN:
                                            System.out.println("GREEN - Go");
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                try {
                                    System.out.print("Enter signal (RED/YELLOW/GREEN): ");
                                    Signal input = Signal.valueOf(sc.next().toUpperCase());

                                    if (input == Signal.RED)
                                        System.out.println("STOP!");
                                    else if (input == Signal.GREEN)
                                        System.out.println("GO!");
                                    else
                                        System.out.println("WAIT...");
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Invalid Signal!");
                                }
                                break;

                            case 3:
                                System.out.println("Returning to Main Menu...");
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (trafficChoice != 3);
                    break;

                case 2:
                    int dayChoice;
                    do {
                        System.out.println("\n--- Weekday Menu ---");
                        System.out.println("1. Check if Working Day");
                        System.out.println("2. Check if Weekend");
                        System.out.println("3. Display All Days");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        dayChoice = sc.nextInt();

                        switch (dayChoice) {

                            case 1:
                                try {
                                    System.out.print("Enter day: ");
                                    Day d = Day.valueOf(sc.next().toUpperCase());

                                    if (d == Day.SATURDAY || d == Day.SUNDAY)
                                        System.out.println("Not a Working Day");
                                    else
                                        System.out.println("Working Day");
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Invalid Day!");
                                }
                                break;

                            case 2:
                                try {
                                    System.out.print("Enter day: ");
                                    Day d = Day.valueOf(sc.next().toUpperCase());

                                    if (d == Day.SATURDAY || d == Day.SUNDAY)
                                        System.out.println("Weekend");
                                    else
                                        System.out.println("Not Weekend");
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Invalid Day!");
                                }
                                break;

                            case 3:
                                System.out.println("Days of the Week:");
                                for (Day d : Day.values()) {
                                    System.out.println(d);
                                }
                                break;

                            case 4:
                                System.out.println("Returning to Main Menu...");
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (dayChoice != 4);
                    break;

                case 3:
                    int orderChoice;
                    do {
                        System.out.println("\n--- Order Status Menu ---");
                        System.out.println("1. Show Order Status");
                        System.out.println("2. Check if Order is Completed");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        orderChoice = sc.nextInt();

                        switch (orderChoice) {

                            case 1:
                                System.out.println("Available Order Status:");
                                for (OrderStatus status : OrderStatus.values()) {
                                    System.out.println(status);
                                }
                                break;

                            case 2:
                                try {
                                    System.out.print("Enter order status: ");
                                    OrderStatus os = OrderStatus.valueOf(sc.next().toUpperCase());

                                    if (os == OrderStatus.DELIVERED)
                                        System.out.println("Order Completed");
                                    else if (os == OrderStatus.CANCELLED)
                                        System.out.println("Order Cancelled");
                                    else
                                        System.out.println("Order Not Completed Yet");
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Invalid Order Status!");
                                }
                                break;

                            case 3:
                                System.out.println("Returning to Main Menu...");
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (orderChoice != 3);
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (mainChoice != 4);

        sc.close();
    }
}