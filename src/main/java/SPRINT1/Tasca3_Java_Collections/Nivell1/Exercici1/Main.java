package SPRINT1.Tasca3_Java_Collections.Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<Month>();
        months.add(new Month ("January"));
        months.add(new Month ("February"));
        months.add(new Month ("March"));
        months.add(new Month ("April"));
        months.add(new Month ("May"));
        months.add(new Month ("June"));
        months.add(new Month ("July"));
        months.add(new Month ("September"));
        months.add(new Month ("October"));
        months.add(new Month ("November"));
        months.add(new Month ("December"));
        Month august = new Month("August");
        months.add(7, august);

        System.out.println("Imprimiendo ArrayList:");
        for(Month month : months) {
            System.out.println("- " + month.getName());
        }

        HashSet<Month> monthsHashSet = new HashSet<>(months);
        monthsHashSet.add(august);

        System.out.println("\nImprimiendo HashSet con Foreach:");
        for(Month month : monthsHashSet) {
            System.out.println("- " + month.getName());
        }

        System.out.println("\nImprimiendo HashSet con Iterator:");
        Iterator<Month> it = monthsHashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
