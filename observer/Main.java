package observer;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        Customer customer = new CustomerImpl("Sahhana");

        order.addCustomer(customer);

        order.setStatus("Ordered");
        order.setStatus("Packed");
        order.setStatus("Shipped");
        order.setStatus("Delivered");
    }
}
