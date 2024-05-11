package SPRINT3.Tasca2_Patterns_2.Nivell2.Payment;

public class CreditCard implements PaymentMethod {
    @Override
    public void makePayment() {
        System.out.println("Processing payment with credit card...");
    }
}