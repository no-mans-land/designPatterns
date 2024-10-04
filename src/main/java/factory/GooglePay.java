package factory;

public class GooglePay implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("google pay payment");
    }
}
