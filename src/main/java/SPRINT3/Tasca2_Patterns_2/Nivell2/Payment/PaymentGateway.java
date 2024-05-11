package SPRINT3.Tasca2_Patterns_2.Nivell2.Payment;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, Callback callback) {

        paymentMethod.makePayment();

        callback.paymentCompleted();
    }
}