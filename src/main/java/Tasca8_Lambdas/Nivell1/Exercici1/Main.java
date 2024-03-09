package Tasca8_Lambdas.Nivell1.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Plant");
        words.add("Dog");
        words.add("Cat");
        words.add("Pizza");
        words.add("Flower");
        words.add("Coffee");
        words.add("Work");
        words.add("Tea");

        words.stream()
                .filter(o -> o.contains("o"))
                .toList()
                .forEach(System.out::println);
    }
}
