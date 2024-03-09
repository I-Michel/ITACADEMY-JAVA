package Tasca7_Annotations.Nivell1.Exercici1;

public class Main {
    public static void main(String[] args) {

        TreballadorPresencial pax1 = new TreballadorPresencial("Júlia", "Guerrero i Claravalls", 21.95f);
        TreballadorOnline pax2 = new TreballadorOnline("Hector", "Pozo Guerrero", 21.95f, 61.25f);

        System.out.println(pax1 + "\nSou mensual actual: " + pax1.calcularSou(160) + " euros.");
        System.out.println(pax2 + "\nSou mensual actual: " + pax2.calcularSou(160) + " euros.");

    }
}
