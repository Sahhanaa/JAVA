interface Printer {
    void print();
}

class HPPrinter implements Printer, Runnable {
    public void print() {
        System.out.println("HP Printer printing...");
    }
    public void run() { print(); }
}

class CanonPrinter implements Printer, Runnable {
    public void print() {
        System.out.println("Canon Printer printing...");
    }
    public void run() { print(); }
}

public class PrinterSystem {
    public static void main(String[] args) {
        new Thread(new HPPrinter()).start();
        new Thread(new CanonPrinter()).start();
    }
}