package strategyPattern.context;

import strategyPattern.strategy.PaymentStrategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){

        if(paymentStrategy == null){
            throw new IllegalArgumentException("payment strategy not set");
        }

        paymentStrategy.pay(amount);
    }

}