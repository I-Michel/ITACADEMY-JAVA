package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici1;

public class Corda extends Instrument {

    public Corda(String nomInstrument, float preuInstrument) {
        super(nomInstrument, preuInstrument);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de corda.");
    }

    public String toString() {
        return "Instrument de corda amb nom " + super.getNomInstrument() +
                " i amb un preu de " + super.getPreuInstrument() + " euros.";
    }
}