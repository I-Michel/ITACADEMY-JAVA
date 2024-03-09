package Tasca4_Testing.Nivell1.Exercici3;

public class MainT4_N1_Ex3 {
    public static void main(String[] args) {

        llancemException();

    }

    public static void llancemException() throws ArrayIndexOutOfBoundsException {

        int[] arrayExemple = new int[3];
        arrayExemple[8] = 5;

    }
}
