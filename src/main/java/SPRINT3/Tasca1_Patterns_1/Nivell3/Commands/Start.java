package SPRINT3.Tasca1_Patterns_1.Nivell3.Commands;

import SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles.*;

public class Start implements Command {
    private Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}