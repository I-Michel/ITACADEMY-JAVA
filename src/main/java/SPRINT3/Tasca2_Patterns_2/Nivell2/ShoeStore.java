package SPRINT3.Tasca2_Patterns_2.Nivell2;

import SPRINT3.Tasca2_Patterns_2.Nivell2.Payment.*;

public class ShoeStore implements Callback {
    PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void paymentCompleted() {
        System.out.println("Payment processed. The transaction has been completed.");
    }
}