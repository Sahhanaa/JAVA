package strategy;

public class Main {

    public static void main(String[] args) {

        PaymentContext payment1 =
                new PaymentContext(new UpiPayment());
        payment1.makePayment(1000);

        PaymentContext payment2 =
                new PaymentContext(new CreditCardPayment());
        payment2.makePayment(2000);

        PaymentContext payment3 =
                new PaymentContext(new NetBankingPayment());
        payment3.makePayment(3000);
    }
}
