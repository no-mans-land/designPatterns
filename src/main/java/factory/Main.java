package factory;

public class Main {

    public static void main(String[] args) {
        Payment googlePayment = PaymentFactory.createPayment("GooglePay");
        googlePayment.processPayment(100);

        Payment paypalPayment = PaymentFactory.createPayment("Paypal");
        paypalPayment.processPayment(10);


    }
}
