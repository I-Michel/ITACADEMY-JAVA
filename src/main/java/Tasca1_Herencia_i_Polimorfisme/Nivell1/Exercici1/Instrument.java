package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici1;

public abstract class Instrument {

    private String nomInstrument;
    private float preuInstrument;

    public Instrument(String nomInstrument, float preuInstrument) {
        this.nomInstrument = nomInstrument;
        this.preuInstrument = preuInstrument;
    }

    {
        System.out.println("Bloc d'inicialització: inicialitzant instrument.");
    }

   static {
       System.out.println("Bloc estàtic.");
    }

    public String getNomInstrument() {
        return nomInstrument;
    }
    public float getPreuInstrument() {
        return preuInstrument;
    }

    public void setNomInstrument(String nomInstrument) {
        this.nomInstrument = nomInstrument;
    }
    public void setPreuInstrument(float preuInstrument) {
        this.preuInstrument = preuInstrument;
    }

    public static void metodeEstatic() {
        System.out.println("Mètode estàtic.");
    }

    public abstract void tocar();
}