package factory;

public class PaymentFactory {

    public static Payment createPayment(String type){

        switch (type){
            case "CreditCard":
                return new CreditCardPayment();
            case "Paypal":
                return new PaypalPayment();
            case "GooglePay":
                return new GooglePay();
            default:
                throw new IllegalArgumentException("unknown payment method");
        }

    }
}
