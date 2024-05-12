package SPRINT3.Tasca1_Patterns_1.Nivell3.Commands;

import SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles.*;

public class Stop implements Command {
    private Vehicle vehicle;

    public Stop(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.stop();
    }
}