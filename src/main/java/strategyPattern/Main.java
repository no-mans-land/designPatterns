package strategyPattern;

import strategyPattern.context.PaymentContext;
import strategyPattern.strategy.PaymentStrategy;
import strategyPattern.strategy.PaypalPaymentStrategy;
import strategyPattern.strategy.StripePaymentStrategy;

public class Main {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new StripePaymentStrategy());
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PaypalPaymentStrategy());
        paymentContext.pay(300);

    }
}
