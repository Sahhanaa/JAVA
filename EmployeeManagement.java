import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;

    void setEmployee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("----------------------");
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[100]; // Array of employees
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    if(count < 100) {
                        emp[count] = new Employee();

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        emp[count].setEmployee(id, name, dept);
                        count++;

                        System.out.println("Employee Added Successfully!");
                    } else {
                        System.out.println("Employee List is Full!");
                    }
                    break;

                case 2:
                    if(count == 0) {
                        System.out.println("No Employees Found!");
                    } else {
                        for(int i = 0; i < count; i++) {
                            emp[i].displayEmployee();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < count; i++) {
                        if(emp[i].id == searchId) {
                            emp[i].displayEmployee();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}