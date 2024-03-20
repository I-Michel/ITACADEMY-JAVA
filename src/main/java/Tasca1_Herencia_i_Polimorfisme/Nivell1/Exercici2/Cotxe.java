package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici2;

public class Cotxe {

    private final static String MARCA = "Honda";
    private final int POTENCIA;
    private static String model = "Civic";

    public Cotxe(int potencia) {
        this.POTENCIA = potencia;
    }

    public static String getMARCA() {
        return MARCA;
    }
    public int getPOTENCIA() {
        return POTENCIA;
    }
    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {     // No sé si este setter es necesario ya que model es estático
        Cotxe.model = model;                        // y se cambiaría el modelo de todos los coches
    }

    public String accelerar() {
        return "El vehicle està accelerant.";
    }

    public static String frenar() {
        return "El vehicle està frenant.";
    }

    @Override
    public String toString() {
        return "Cotxe de la marca " + MARCA + ", model " + model +
                " i una potència de " + POTENCIA + " CV.";
    }
}

