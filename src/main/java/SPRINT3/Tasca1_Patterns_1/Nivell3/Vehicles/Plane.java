package SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("The plane is starting to move!");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is taking off!");

    }

    @Override
    public void stop() {
        System.out.println("The plane is landing!");
    }
}