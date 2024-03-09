package Tasca3_Java_Collections.Nivell2.Exercici1;

import java.util.HashSet;

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

        for(Restaurant restaurant : restaurants) {
            System.out.println("- " + restaurant);
        }

    }
}
