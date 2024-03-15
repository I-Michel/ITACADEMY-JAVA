package Tasca8_Lambdas.Nivell1.Exercici7;

import java.util.ArrayList;
import java.util.Comparator;

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
        words.add("日本語");
        words.add("中文");
        words.add("dfgfdhfsadgdfgdf");
        words.add("火");

        words.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
}
