package SPRINT3.Tasca2_Patterns_2.Nivell2;

import SPRINT3.Tasca2_Patterns_2.Nivell2.Payment.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void start() {

        int opt = 0;
        Scanner sc = new Scanner(System.in);

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new Paypal();
        PaymentMethod bankAccount = new BankAccount();
        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        System.out.println("Welcome to the Shoe Store.\nYou chose the perfect shoes!!!");

        do {
            System.out.println("Please choose your payment method:" +
                    "\n1. Credit card." + "\n2. PayPal." + "\n3. Bank Account.");

            try {
                opt = sc.nextInt();
                sc.nextLine();

                if(opt < 1 || opt > 3) {
                    System.out.println("Ooops. You must choose an option between 1 and 3.");
                }

            } catch (InputMismatchException e) {
                System.err.println("Error: you must enter an integer.");
                sc.nextLine();
            }
        } while (opt < 1 || opt > 3);

        switch (opt) {
            case 1:
                paymentGateway.processPayment(creditCard, shoeStore);
                break;
            case 2:
                paymentGateway.processPayment(payPal, shoeStore);
                break;
            case 3:
                paymentGateway.processPayment(bankAccount, shoeStore);
                break;
        }

        System.out.println("Thank you very much. Enjoy your shoes!");
    }
}