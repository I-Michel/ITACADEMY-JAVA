package SPRINT1.Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.Scanner;

public class Basquet extends Noticia {

    private String competicio;
    private String club;

    public Basquet(String titular, Redactor redactor, String competicio, String club) {
        super(titular, redactor);
        this.competicio = competicio;
        this.club = club;
        calcularPuntuacio();
        calcularPreuNoticia();
    }

    public String getCompeticio() {
        return competicio;
    }
    public String getClub() {
        return club;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
    public void setClub(String club) {
        this.club = club;
    }

    public static Basquet noticiaBasquet(Redactor redactor, String titular) {
        Scanner sc = new Scanner(System.in);
        String competicio;
        String club;

        System.out.println("A quina competició fa referència aquesta notícia de bàsquet?");
        competicio = sc.nextLine();
        System.out.println("A quin club fa referència aquesta notícia de bàsquet?");
        club = sc.nextLine();

        return new Basquet(titular, redactor, competicio, club);
    }

    @Override
    public void calcularPreuNoticia() {
        float preu = 250f;
        preu = this.competicio.equalsIgnoreCase("Eurolliga") ? preu + 75f : preu;
        preu = this.club.equalsIgnoreCase("Barça") ||
                this.club.equalsIgnoreCase("Madrid") ? preu + 75f : preu;

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacio() {
        int punts = 4;
        punts = this.competicio.equalsIgnoreCase("Eurolliga") ? punts + 3 : punts;
        punts = this.competicio.equalsIgnoreCase("ACB") ? punts + 2 : punts;
        punts = this.club.equalsIgnoreCase("Barça") ||
                this.club.equalsIgnoreCase("Madrid") ? punts + 1 : punts;

        setPuntuacio(punts);
    }

    @Override
    public String toString() {
        return "Notícia de bàsquet amb titular \"" + super.getTitular() + "\", puntuació de " +
                super.getPuntuacio() + " punts i un preu de " + super.getPreu() +
                " €. Fa referència a la competició " + this.competicio + " i al club " +
                this.club + ".\nRedactor/a: " + super.getRedactor() +
                "\nText de la notícia: \"" + super.getText() + "\".";
    }
}