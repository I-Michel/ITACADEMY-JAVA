package SPRINT3.Tasca1_Patterns_1.Nivell3.Commands;

import SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles.*;

public class Accelerate implements Command {
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}