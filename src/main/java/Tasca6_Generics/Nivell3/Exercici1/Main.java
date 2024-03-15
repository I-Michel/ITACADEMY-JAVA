package Tasca6_Generics.Nivell3.Exercici1;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Michel", 612345678);

        System.out.println("From genericPhone(): ");
        Generic.genericPhone(smartphone);

        System.out.println("\nFrom genericSmartphone(): ");
        Generic.genericSmartphone(smartphone);
    }
}
