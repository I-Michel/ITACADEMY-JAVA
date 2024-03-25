package SPRINT1.Tasca8_Lambdas.Nivell2.Exercici4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Plant");
        list.add("Dog");
        list.add("Cat");
        list.add("54321");
        list.add("Pizza");
        list.add("Ape");
        list.add("Flower");
        list.add("12345");
        list.add("Coffee");
        list.add("4598");
        list.add("Work");
        list.add("Tea");
        list.add("Aloe vera");

        System.out.println("Alphabetically sorted list:");
        list.stream().sorted().toList().forEach(System.out::println);

        System.out.println("\nSorted list by words containing \"E\":");
        list.stream().sorted().filter(l -> (l.contains("e") || l.contains("E"))).toList().forEach(System.out::println);
        list.stream().sorted().filter(l -> (!l.contains("e") && !l.contains("E"))).toList().forEach(System.out::println);

        System.out.println("\nSorted list by replacing \"a\" for \"4\":");
        list.stream().sorted().forEach(l -> {
            l = l.replaceAll("[aA]", "4");
            System.out.println(l);
        });

        System.out.println("\nSorted list of numbers only:");
        list.stream().sorted().filter(s -> s.matches("\\d+")).forEach(System.out::println);
    }
}