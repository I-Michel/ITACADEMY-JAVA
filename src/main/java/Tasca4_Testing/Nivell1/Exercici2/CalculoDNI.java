package Tasca4_Testing.Nivell1.Exercici2;

public class CalculoDNI {

    private final int NUM_DNI;

    public CalculoDNI(int NUM_DNI) {
        this.NUM_DNI = NUM_DNI;
    }

    public int getNUM_DNI() {
        return NUM_DNI;
    }

    public char calcularLletra() {
        char lletra = ' ';
        char[] lletres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int residu = NUM_DNI % 23;
        lletra = lletres[residu];

        return lletra;
    }

    public String toString() {
        return "DNI nº " + NUM_DNI + " amb lletra " + calcularLletra() + ".";
    }
}
