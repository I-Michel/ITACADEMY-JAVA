package Tasca6_Generics.Nivell2.Exercici2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> llista = new ArrayList<Object>();
        llista.add(new Persona("Ingrid", "Michel", 31));
        llista.add("日本へまた行きたいんです。");
        llista.add(12345);

        GenericMethods.metodeGeneric(llista);

    }
}
