package SPRINT3.Tasca2_Patterns_2.Nivell2.Payment;

public class Paypal implements PaymentMethod {
    @Override
    public void makePayment() {
        System.out.println("Processing payment with Paypal...");
    }
}