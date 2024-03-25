package Sprint1.Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici1;

public class Vent extends Instrument {

    public Vent(String nomInstrument, float preuInstrument) {
        super(nomInstrument, preuInstrument);

    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de vent.");
    }

    @Override
    public String toString() {
        return "Instrument de vent amb nom " + super.getNomInstrument() +
                " i amb un preu de " + super.getPreuInstrument() + " euros.";
    }
}