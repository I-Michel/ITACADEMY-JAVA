package Tasca8_Lambdas.Nivell2.Exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Crea una llista que contingui algunes cadenes de text i nombres.
        //Ordena-les per:
        //- Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer caràcter)
        //- Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
        //- Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        //- Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).

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
        list.stream()
                .sorted()
                .toList()
                .forEach(System.out::println);

        System.out.println("\n:");
        list.stream()
                .sorted()
                .filter(l -> (l.contains("e") || l.contains("E"))).toList().forEach(System.out::println);
        list.stream()
                .sorted()
                .filter(l -> (!l.contains("e") && !l.contains("E"))).toList().forEach(System.out::println);

        System.out.println("\n:");
        list.stream()
                .sorted()
                .forEach(l -> {
                    if (l.contains("a")) {
                        l = l.replace('a', '4');
                    }
                    if (l.contains("A")) {
                        l = l.replace('A', '4');
                    }
                    System.out.println(l);
                });

        System.out.println("\n:");
        list.stream()
                .sorted()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }
}
