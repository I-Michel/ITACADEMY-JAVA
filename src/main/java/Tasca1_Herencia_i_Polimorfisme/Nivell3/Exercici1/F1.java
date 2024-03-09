package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

public class F1 extends Noticia {

    private String escuderia;

    public F1(String titular, Redactor redactor, String escuderia) {
        super(titular, redactor);
        this.escuderia = escuderia;
        calcularPuntuacio();
        calcularPreuNoticia();
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPreuNoticia() {
        float preu = 100f;
        preu = this.escuderia.equalsIgnoreCase("Ferrari") ||
                this.escuderia.equalsIgnoreCase("Mercedes") ? preu + 50f : preu;

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacio() {
        int punts = 4;
        punts = this.escuderia.equalsIgnoreCase("Ferrari") ||
                this.escuderia.equalsIgnoreCase("Mercedes") ? punts + 2 : punts;

        setPuntuacio(punts);
    }

    @Override
    public String toString() {
        return "Notícia de F1 amb titular \"" + super.getTitular() + "\", puntuació de " +
                super.getPuntuacio() + " punts i un preu de " + super.getPreu() +
                " €. Fa referència a l'escuderia " + this.escuderia +
                ".\nRedactor/a: " + super.getRedactor() +
                "\nText de la notícia: \"" + super.getText() + "\".";
    }
}
