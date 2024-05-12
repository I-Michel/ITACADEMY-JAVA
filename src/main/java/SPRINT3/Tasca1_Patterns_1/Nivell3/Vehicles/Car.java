package SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car is starting up!");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is speeding up!");

    }

    @Override
    public void stop() {
        System.out.println("The car is stopping!");
    }
}