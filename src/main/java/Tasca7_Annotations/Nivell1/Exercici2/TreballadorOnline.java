package Tasca7_Annotations.Nivell1.Exercici2;

public class TreballadorOnline extends Treballador {

    private final float INTERNET;

    public TreballadorOnline(String nom, String cognom, float preuHora, float internet) {
        super(nom, cognom, preuHora);
        INTERNET = internet;
    }

    public float getINTERNET() {
        return INTERNET;
    }

    @Override
    public float calcularSou(int hores) {
        return hores * getPreuHora() + INTERNET;
    }

    @Deprecated
    public void plusDieta() {
        System.out.println("Ya no se pagan las dietas a los trabajadores online.");
    }

    public String toString() {
        return "Treballador online " + super.getNom() + " " + super.getCognom() + " amb un sou de " +
                super.getPreuHora() + " euros per hora treballada més un fixe de " +
                INTERNET + " euros en concepte de la tarifa plana d'Internet.";
    }
}
