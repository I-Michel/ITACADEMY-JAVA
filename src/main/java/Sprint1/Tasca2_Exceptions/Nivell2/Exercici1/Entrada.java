package Sprint1.Tasca2_Exceptions.Nivell2.Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner sc = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        byte byteLlegit = 0;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                byteLlegit = sc.nextByte();
                ok = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: si us plau, introdueix un byte vàlid.");
            }
            sc.nextLine();
        } while (!ok);

        return byteLlegit;
    }

    public static int llegirInt(String missatge) {
        int intLlegit = 0;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                intLlegit = sc.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: si us plau, introdueix un integer vàlid.");
            }
            sc.nextLine();
        } while (!ok);

        return intLlegit;
    }

    public static float llegirFloat(String missatge) {
        float floatLlegit = 0f;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                floatLlegit = sc.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: si us plau, introdueix un float vàlid.");
            }
            sc.nextLine();
        } while (!ok);

        return floatLlegit;
    }

    public static double llegirDouble(String missatge) {
        double doubleLlegit = 0d;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                doubleLlegit = sc.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: si us plau, introdueix un double vàlid.");
            }
            sc.nextLine();
        } while (!ok);

        return doubleLlegit;
    }

    public static char llegirChar(String missatge) {
        char charLlegit = ' ';
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                charLlegit = sc.next().charAt(0);
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: si us plau, introdueix un character vàlid.");
            }
            sc.nextLine();
        } while (!ok);

        return charLlegit;
    }

    public static String llegirString(String missatge) {
        String stringLlegit = "";
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                stringLlegit = sc.nextLine();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: si us plau, introdueix un string vàlid.");
            }
        } while (!ok);

        return stringLlegit;
    }

    public static boolean llegirSiNo(String missatge) {
        boolean booleanLlegit = false;
        boolean ok = false;
        String resposta = "";

        do {
            System.out.println(missatge);
            resposta = sc.nextLine();

            try {
                if (resposta.equalsIgnoreCase("s")) {
                    booleanLlegit = true;
                    ok = true;
                } else if (resposta.equalsIgnoreCase("n")) {
                    booleanLlegit = false;
                    ok = true;
                } else {
                    System.out.println("Si us plau, introdueix una resposta vàlida.");
                    ok = false;
                }
            } catch (Exception e) {
                System.err.println("Error: si us plau, introdueix un boolean vàlid.");
            }
        } while (!ok);

        return booleanLlegit;
    }
}
