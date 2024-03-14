package Tasca6_Generics.Nivell2.Exercici1;

public class GenericMethods {

    public static <T, String> void metodeGeneric(T generic1, String generic2, T generic3) {
        System.out.println(generic1 + "\n" + generic2 + "\n" + generic3);
    }
}
