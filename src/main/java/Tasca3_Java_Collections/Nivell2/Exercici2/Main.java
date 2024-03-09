package Tasca3_Java_Collections.Nivell2.Exercici2;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    static HashSet<Restaurant> restaurants = new HashSet<>();

    public static void main(String[] args) {

        restaurants.add(new Restaurant("Koryo", 10));
        restaurants.add(new Restaurant("Koryo", 10));
        restaurants.add(new Restaurant("Koryo", 8));
        restaurants.add(new Restaurant("Samsara", 9));
        restaurants.add(new Restaurant("Samsara", 8));
        restaurants.add(new Restaurant("Samsara", 8));
        restaurants.add(new Restaurant("Yashima", 10));

        System.out.println("Restaurants al HashSet:");
        for(Restaurant restaurant : restaurants) {
            System.out.println("- " + restaurant);
        }

        System.out.println("\nRestaurants ordenats per nom i puntuació:");
        TreeSet<Restaurant> treeSet = new TreeSet<>(restaurants);
        for(Restaurant restaurant : treeSet) {
            System.out.println("- " + restaurant);
        }
    }
}
