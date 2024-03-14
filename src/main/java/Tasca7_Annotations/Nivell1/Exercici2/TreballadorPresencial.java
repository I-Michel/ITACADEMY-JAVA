package Tasca7_Annotations.Nivell1.Exercici2;

public class TreballadorPresencial extends Treballador {

    private static float benzina;

    public TreballadorPresencial(String nom, String cognom, float preuHora) {
        super(nom, cognom, preuHora);
        benzina = 50f;
    }

    public static float getBenzina() {
        return benzina;
    }

    public static void setBenzina(float benzina) {
        TreballadorPresencial.benzina = benzina;
    }

    @Override
    public float calcularSou(int hores) {
        return hores * getPreuHora() + benzina;
    }

    @Deprecated
    public void plusNocturnidad() {
        System.out.println("Los trabajadores presenciales ya no realizan horas nocturnas.");
    }

    @Override
    public String toString() {
        return "Treballador presencial " + super.getNom() + " " + super.getCognom() + " amb un sou de " +
                super.getPreuHora() + " euros per hora treballada més un fixe de " +
                benzina + " euros en concepte de benzina.";
    }
}
