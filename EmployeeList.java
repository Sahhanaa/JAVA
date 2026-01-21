import java.util.Scanner;
class EmployeeList
{
    int emp[] = new int[20];   
    int n = 0;        
    Scanner sc = new Scanner(System.in);

    void addEmployee()
    {
        System.out.print("Enter new Employee ID: ");
        emp[n] = sc.nextInt();
        n++;
        System.out.println("Employee added successfully");
    }


    void removeEmployee()
    {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();
        int pos = -1;

        for(int i = 0; i < n; i++)
        {
            if(emp[i] == id)
            {
                pos = i;
                break;
            }
        }

        if(pos == -1)
        {
            System.out.println("Employee ID not found");
        }
        else
        {
            for(int i = pos; i < n - 1; i++)
            {
                emp[i] = emp[i + 1];
            }
            n--;
            System.out.println("Employee removed successfully");
        }
    }

    void displayEmployees()
    {

        System.out.println("Employee ID List:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(emp[i]);
        }
    }

    public static void main(String[] args)
    {
        EmployeeList el = new EmployeeList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Employee ID");
            System.out.println("2. Remove Employee ID");
            System.out.println("3. Display Employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
				{
                    el.addEmployee();
				    break;
				}
                case 2: 
				{
					el.removeEmployee(); 
				    break;
				}
				
                case 3: 
				{
				    el.displayEmployees();
					break;
				}
                case 4:
				{
					System.out.println("Exiting program");
					break;
				}
                default: 
				    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}