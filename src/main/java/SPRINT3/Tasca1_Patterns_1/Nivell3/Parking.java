package SPRINT3.Tasca1_Patterns_1.Nivell3;

import SPRINT3.Tasca1_Patterns_1.Nivell3.Commands.*;
import SPRINT3.Tasca1_Patterns_1.Nivell3.Vehicles.*;

public class Parking {
    public static void start() {

        CommandInvoker commands = new CommandInvoker();

        executeOrders(commands, new Car());
        executeOrders(commands, new Bike());
        executeOrders(commands, new Plane());
        executeOrders(commands, new Ship());
    }

    public static void executeOrders(CommandInvoker commands, Vehicle vehicle) {
        commands.setStart(new Start(vehicle));
        commands.setAccelerate(new Accelerate(vehicle));
        commands.setStop(new Stop(vehicle));

        commands.executeStart();
        commands.executeAccelerate();
        commands.executeStop();
    }
}