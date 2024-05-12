package SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles;

public class Ship implements Vehicle {
    @Override
    public void start() {
        System.out.println("The ship is setting sail!");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship is speeding up!");

    }

    @Override
    public void stop() {
        System.out.println("The ship is docking!");
    }
}