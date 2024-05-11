package SPRINT3.Tasca2_Patterns_2.Nivell2.Payment;

public class BankAccount implements PaymentMethod{
    @Override
    public void makePayment() {
        System.out.println("Processing payment with bank account...");
    }
}