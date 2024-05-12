package SPRINT3.Tasca1_Patterns_1.Nivell3;

import SPRINT3.Tasca1_Patterns_1.Nivell3.Commands.*;

public class CommandInvoker {
    private Command start;
    private Command accelerate;
    private Command stop;

    public void setStart(Command start) {
        this.start = start;
    }

    public void setAccelerate(Command accelerate) {
        this.accelerate = accelerate;
    }

    public void setStop(Command stop) {
        this.stop = stop;
    }

    public void executeStart() {
        start.execute();
    }

    public void executeAccelerate() {
        accelerate.execute();
    }

    public void executeStop() {
        stop.execute();
    }
}