package Tasca8_Lambdas.Nivell2.Exercici2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(57);
        integers.add(7);
        integers.add(756);
        integers.add(86);
        integers.add(24);

        String cadenaIntegers = integers.stream()
                .map(i -> (i % 2 == 0 ? "e" : "o") + i)
                .collect(Collectors.joining(", "));

        System.out.println(cadenaIntegers);
    }
}
