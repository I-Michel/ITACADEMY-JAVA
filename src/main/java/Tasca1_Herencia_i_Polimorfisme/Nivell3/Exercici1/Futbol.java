package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.Scanner;

public class Futbol extends Noticia {

    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, Redactor redactor, String competicio, String club, String jugador) {
        super(titular, redactor);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        calcularPuntuacio();
        calcularPreuNoticia();
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getClub() {
        return club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public static Futbol noticiaFutbol(Redactor redactor, String titular) {
        Scanner sc = new Scanner(System.in);
        String competicio;
        String club;
        String jugador;

        System.out.println("A quina competició fa referència aquesta notícia de futbol?");
        competicio = sc.nextLine();
        System.out.println("A quin club fa referència aquesta notícia de futbol?");
        club = sc.nextLine();
        System.out.println("A quin jugador fa referència aquesta notícia de futbol?");
        jugador = sc.nextLine();

        return new Futbol(titular, redactor, competicio, club, jugador);
    }

    @Override
    public void calcularPreuNoticia() {
        float preu = 300f;
        preu = this.competicio.equalsIgnoreCase("Lliga de Campions") ? preu + 100f : preu;
        preu = this.club.equalsIgnoreCase("Barça") ||
                this.club.equalsIgnoreCase("Madrid") ? preu + 100f : preu;
        preu = this.jugador.equalsIgnoreCase("Ferran Torres") ||
                this.jugador.equalsIgnoreCase("Benzema") ? preu + 50f : preu;

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacio() {
        int punts = 5;
        punts = this.competicio.equalsIgnoreCase("Lliga de Campions") ? punts + 3 : punts;
        punts = this.competicio.equalsIgnoreCase("Lliga") ? punts + 2 : punts;
        punts = this.club.equalsIgnoreCase("Barça") ||
                this.club.equalsIgnoreCase("Madrid") ? punts + 1 : punts;
        punts = this.jugador.equalsIgnoreCase("Ferran Torres") ||
                this.jugador.equalsIgnoreCase("Benzema") ? punts + 1 : punts;

        setPuntuacio(punts);
    }

    @Override
    public String toString() {
        return "Notícia de futbol amb titular \"" + super.getTitular() + "\", puntuació de " +
                super.getPuntuacio() + " punts i un preu de " + super.getPreu() +
                " €. Fa referència a la competició " + this.competicio + ", al club " + this.club +
                " i al jugador/a " + this.jugador + ".\nRedactor/a: " + super.getRedactor() +
                "\nText de la notícia: \"" + super.getText() + "\".";
    }
}