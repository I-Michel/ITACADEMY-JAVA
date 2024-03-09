package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

public class Tenis extends Noticia {

    private String competicio;
    private String tenistes;

    public Tenis(String titular, Redactor redactor, String competicio, String tenistes) {
        super(titular, redactor);
        this.competicio = competicio;
        this.tenistes = tenistes;
        calcularPuntuacio();
        calcularPreuNoticia();
    }

    public String getCompeticio() {
        return competicio;
    }
    public String getTenistes() {
        return tenistes;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
    public void setTenistes(String tenistes) {
        this.tenistes = tenistes;
    }

    @Override
    public void calcularPreuNoticia() {
        float preu = 150f;
        preu = this.tenistes.equalsIgnoreCase("Federer") ||
                this.tenistes.equalsIgnoreCase("Nadal") ||
                this.tenistes.equalsIgnoreCase("Djokovic") ? preu + 100f : preu;

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacio() {
        int punts = 4;
        punts = this.tenistes.equalsIgnoreCase("Federer") ||
                this.tenistes.equalsIgnoreCase("Nadal") ||
                this.tenistes.equalsIgnoreCase("Djokovic") ? punts + 3 : punts;

        setPuntuacio(punts);
    }

    @Override
    public String toString() {
        return "Notícia de tenis amb titular \"" + super.getTitular() + "\", puntuació de " +
                super.getPuntuacio() + " punts i un preu de " + super.getPreu() +
                " €. Fa referència a la competició " + this.competicio + " i als tenistes " +
                this.tenistes + ".\nRedactor/a: " + super.getRedactor() +
                "\nText de la notícia: \"" + super.getText() + "\".";
    }
}