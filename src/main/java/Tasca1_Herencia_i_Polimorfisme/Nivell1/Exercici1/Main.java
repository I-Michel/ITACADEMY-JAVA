package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Demostrant inicialització de la classe Instrument accedint a un membre estàtic:");
        Instrument.metodeEstatic();

        System.out.println("Demostrant inicialització de les classes per instancia:");
        Vent vent1 = new Vent("flauta", 9.95f);
        Corda corda1 = new Corda("guitarra", 305.95f);
        Percussio percussio1 = new Percussio("tambor", 57.95f);

        System.out.println(vent1);
        System.out.println(corda1);
        System.out.println(percussio1);

        System.out.println("Tocant instruments:");
        vent1.tocar();
        corda1.tocar();
        percussio1.tocar();
    }
}