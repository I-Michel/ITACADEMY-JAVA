package SPRINT3.Tasca2_Patterns_2.Nivell3;

import java.util.ArrayList;

public class App {

    static ArrayList<Product> products = new ArrayList<>();

    public static void start() {

        createProducts();
        Converter currencyConverter = new CurrencyConverter();
        Displayer displayer = new Displayer(currencyConverter);

        System.out.println("Welcome to the Plant Shop! These are our products for sale:");
        displayProducts(displayer);
    }

    public static void createProducts() {
        products.add(new Product("Monstera Thai Constellation (15 cm)", 69.95));
        products.add(new Product("Echeveria Crystal Amber (7 cm)", 15));
        products.add(new Product("Haworthia Cooperi OB-1 Variegata (7 cm)", 40));
    }

    public static void displayProducts(Displayer displayer) {
        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println("-----------------------------------");
        displayer.display(products, "USD");
        displayer.display(products, "JPY");
        displayer.display(products, "CNY");
    }
}