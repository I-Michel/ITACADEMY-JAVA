package SPRINT3.Tasca1_Patterns_1.Nivell1;

import java.util.Scanner;

public class Menu {

    public static void start() {

        Scanner sc = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        int opt = 0;

        System.out.println("Hello!");

        do {
            System.out.println("\nSelect an option, please:" +
                    "\n1. Add new command." +
                    "\n2. Undo last command." +
                    "\n3. Show last commands." +
                    "\n4. Exit.");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Type a command, please:");
                    String command = sc.nextLine();
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.undoLastCommand();
                    break;
                case 3:
                    undo.showLastCommands();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You must choose an option between 1 and 4.");
            }
        } while (opt != 4);
    }
}