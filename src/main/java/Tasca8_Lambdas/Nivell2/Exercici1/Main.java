package Tasca8_Lambdas.Nivell2.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Plant");
        words.add("Dog");
        words.add("Cat");
        words.add("Pizza");
        words.add("Ape");
        words.add("Flower");
        words.add("Coffee");
        words.add("Any");
        words.add("Work");
        words.add("Tea");
        words.add("Aloe vera");
        words.add("Ant");

        words.stream().filter(a -> a.startsWith("A") && a.length() == 3).toList()
                .forEach(System.out::println);

    }
}
