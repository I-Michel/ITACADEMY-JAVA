package SPRINT1.Tasca6_Generics.Nivell2.Exercici1;

public class Main {
    public static void main(String[] args) {

        Persona pax1 = new Persona("Ingrid", "Michel", 31);
        String string = "日本へまた行きたいんです。";
        int primitiu = 12345;

        GenericMethods.metodeGeneric(pax1, string, primitiu);
        // GenericMethods.metodeGeneric(string, primitiu, pax1); ---> "primitiu" al no ser String no compila.

    }
}
