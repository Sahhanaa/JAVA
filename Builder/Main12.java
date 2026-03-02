public class Main12 {
    public static void main(String[] args) {
        Student student = new Student.Builder(101, "Alice Johnson")
                .email("alice.johnson@example.com")
                .phone("9876543210")
                .address("45 Park Avenue, New York")
                .build();

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Address: " + student.getAddress());
    }
}