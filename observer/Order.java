package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void setStatus(String status) {

        String message = "";

        if(status.equals("Ordered")) {
            message = "Your order has been placed successfully.";
        }
        else if(status.equals("Packed")) {
            message = "Your order has been packed.";
        }
        else if(status.equals("Shipped")) {
            message = "Your order has been shipped.";
        }
        else if(status.equals("Delivered")) {
            message = "Your order has been delivered successfully.";
        }

        notifyCustomer(message);
    }

    public void notifyCustomer(String message) {
        for(Customer customer : customers) {
            customer.update(message);
        }
    }
}