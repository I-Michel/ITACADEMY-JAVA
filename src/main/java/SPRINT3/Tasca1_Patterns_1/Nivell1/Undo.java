package SPRINT3.Tasca1_Patterns_1.Nivell1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList<String> commands;

    private Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance() {
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        instance.commands.add(command);
        System.out.println("Command added successfully.");
    }

    public void undoLastCommand() {
        String result = "";
        if (!instance.commands.isEmpty()) {
            instance.commands.remove(instance.commands.size() - 1);
            result = "Command undone successfully";

        } else {
           result = "There is no previous command to undo.";
        }
        System.out.println(result);
    }
    public void showLastCommands() {
        System.out.println("These are the last commands:");
        for(String command : instance.commands) {
            System.out.println("- " + command);
        }
    }
}