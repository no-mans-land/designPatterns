package factory;

public class PaypalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("paypal payment");
    }
}
