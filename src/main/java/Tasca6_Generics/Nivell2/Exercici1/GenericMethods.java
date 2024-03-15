package Tasca6_Generics.Nivell2.Exercici1;

public class GenericMethods {

    public static <T> void metodeGeneric(T generic1, String noGeneric, T generic3) {
        System.out.println(generic1 + "\n" + noGeneric + "\n" + generic3);
    }
}
