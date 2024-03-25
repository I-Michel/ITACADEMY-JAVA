package Sprint1.Tasca6_Generics.Nivell2.Exercici2;

import java.util.ArrayList;

public class GenericMethods {

    public static <T> void metodeGeneric(ArrayList<T> llista) {
        for(T t : llista) {
            System.out.println("- " + t);
        }
    }
}
