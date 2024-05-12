package SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("The bike is starting to move!");
    }

    @Override
    public void accelerate() {
        System.out.println("The bike goes faster!");

    }

    @Override
    public void stop() {
        System.out.println("The bike is stopping!");
    }
}