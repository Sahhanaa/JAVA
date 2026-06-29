package observer;

public class CustomerImpl implements Customer {

    private String name;

    public CustomerImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " : " + message);
    }
}
