package SPRINT3.Tasca2_Patterns_2.Nivell3;

import java.util.ArrayList;

public class Displayer {
    private Converter currencyConverter;

    public Displayer(Converter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public void display(ArrayList<Product> products, String currency) {
        System.out.println("PRICES IN " + currency + ":");

        for (Product product : products) {
            double newPrice = currencyConverter.convert(product.getPrice(), currency);
            System.out.println("- " + product.getName() + ": " + newPrice + " " + currency);
        }
        System.out.println("-----------------------------------");
    }
}
