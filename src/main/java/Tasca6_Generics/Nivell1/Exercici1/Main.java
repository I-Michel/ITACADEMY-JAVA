package Tasca6_Generics.Nivell1.Exercici1;

public class Main {
    public static void main(String[] args) {

        Persona pax1 = new Persona("Ingrid", "Michel", 31);
        Persona pax2 = new Persona("Hector", "Pozo", 29);
        Persona pax3 = new Persona("Júlia", "Guerrero", 30);

        System.out.println(pax1);

        NoGenericMethods persones1 = new NoGenericMethods(pax1, pax2, pax3);
        NoGenericMethods persones2 = new NoGenericMethods(pax2, pax3, pax1);

        System.out.println(persones1 + "\n" + persones2);
    }
}
