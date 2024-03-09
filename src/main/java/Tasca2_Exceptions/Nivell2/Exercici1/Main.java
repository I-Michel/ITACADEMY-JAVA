package Tasca2_Exceptions.Nivell2.Exercici1;

public class Main {
    public static void main(String[] args) {

        iniciarPrograma();

    }

    public static void iniciarPrograma() {
        byte byteLlegit = Entrada.llegirByte("Introdueix la teva edat, si us plau:");

        int intLlegit = Entrada.llegirInt("Introdueix un nombre sencer, si us plau:");

        float floatLlegit = Entrada.llegirFloat("Introdueix un nombre decimal amb un màxim de 7" +
                " decimals i separant-los amb una coma, si us plau:");

        double doubleLlegit = Entrada.llegirDouble("Introdueix un nombre decimal amb un màxim de 15" +
                " decimals i separant-los amb una coma, si us plau:");

        char charLlegit = Entrada.llegirChar("Introdueix un sol caràcter qualsevol, si us plau:");

        String stringLlegit = Entrada.llegirString("Introdueix el teu nom, si us plau:");

        boolean booleanLlegit = Entrada.llegirSiNo("Introdueix el caracter \"s\" per respondre \"sí\"" +
                " o el caràcter \"n\" per respondre \"no\", si us plau:");
    }
}
