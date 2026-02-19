import java.util.Scanner;

class Institution {

    String institutionName = "ABC Institution";
    Student student; 

    class Student {
        String studentName;
        int rollNo;
        int[] marks;
        double average;
        String grade;

        void addStudent(String name, int roll, int subjects) {
            studentName = name;
            rollNo = roll;
            marks = new int[subjects];
        }

        void addMarks(Scanner sc) {
            System.out.println("Enter Marks:");
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
        }

        void calculateGrade() {
            int sum = 0;
            for (int m : marks) {
                sum += m;
            }

            average = (double) sum / marks.length;

            if (average >= 90)
                grade = "A";
            else if (average >= 75)
                grade = "B";
            else if (average >= 50)
                grade = "C";
            else
                grade = "Fail";
        }

        void display() {
            System.out.println("\nInstitution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);

            System.out.print("Marks: ");
            for (int m : marks) {
                System.out.print(m + " ");
            }

            System.out.printf("\nAverage: %.2f", average);
            System.out.println("\nGrade: " + grade);
        }
    }
}

public class InnerClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution inst = new Institution();
        Institution.Student stu = inst.new Student();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Number of Subjects: ");
                    int subjects = sc.nextInt();

                    stu.addStudent(name, roll, subjects);
                    break;

                case 2:
                    stu.addMarks(sc);
                    break;

                case 3:
                    stu.calculateGrade();
                    break;

                case 4:
                    stu.display();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}