package SPRINT3.Tasca1_Patterns_1.Nivell2;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Factory.AbstractFactory;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Factory.BrazilianFactory;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Factory.JapaneseFactory;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Factory.SpanishFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Contact> contactBook = new ArrayList<>();

    public static void start() {

        Scanner sc = new Scanner(System.in);
        int opt = 0;

        System.out.println("Hello!");

        do {
            System.out.println("\nSelect an option, please:" +
                    "\n1. Add new contact." +
                    "\n2. Show contact book." +
                    "\n3. Exit.");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    addContact();
                    break;
                case 2:
                    showContacts();
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You must choose an option between 1 and 3.");
            }
        } while (opt != 3);

    }

    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        AbstractFactory factory = null;

        System.out.println("Please, enter the name of the new contact:");
        String name = sc.nextLine();
        System.out.println("Please, enter the phone number of the new contact:");
        String phone = sc.nextLine();
        System.out.println("Please, enter the address of the new contact:");
        String address = sc.nextLine();
        System.out.println("Where is this contact from?");
        do {
            System.out.println("\nSelect an option, please:" +
                    "\n1. Japan." +
                    "\n2. Brazil." +
                    "\n3. Spain.");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    factory = new JapaneseFactory();
                    break;
                case 2:
                    factory = new BrazilianFactory();
                    break;
                case 3:
                    factory = new SpanishFactory();
                    break;
                default:
                    System.out.println("You must choose an option between 1 and 3.");
            }
        } while (opt < 1 || opt > 3);

        contactBook.add(new Contact(name, factory.createAddress(address), factory.createPhone(phone)));
        System.out.println("The new contact has been created successfully.");
    }

    public static void showContacts() {
        if(contactBook.isEmpty()) {
            System.out.println("The contact book is still empty. Please add a new contact.");
        } else {
            for (Contact contact : contactBook) {
                System.out.println("- " + contact);
            }
        }
    }
}