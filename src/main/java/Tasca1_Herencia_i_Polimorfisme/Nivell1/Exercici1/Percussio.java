package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici1;

public class Percussio extends Instrument {

    public Percussio(String nomInstrument, float preuInstrument) {
        super(nomInstrument, preuInstrument);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }

    public String toString() {
        return "Instrument de percussió amb nom " + super.getNomInstrument() +
                " i amb un preu de " + super.getPreuInstrument() + " euros.";
    }
}