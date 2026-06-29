package strategy;

public class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Net Banking Payment Successful: Rs." + amount);
    }
}