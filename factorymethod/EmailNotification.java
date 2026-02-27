
package factorymethod;

public class EmailNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending Email Notification............");
    }
}
