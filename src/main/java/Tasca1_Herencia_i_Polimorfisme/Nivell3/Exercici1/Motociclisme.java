package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.Scanner;

public class Motociclisme extends Noticia {

    private String equip;

    public Motociclisme(String titular, Redactor redactor, String equip) {
        super(titular, redactor);
        this.equip = equip;
        calcularPuntuacio();
        calcularPreuNoticia();
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public static Motociclisme noticiaMotociclisme(Redactor redactor, String titular) {
        Scanner sc = new Scanner(System.in);
        String club;

        System.out.println("A quin equip fa referència aquesta notícia de motociclisme?");
        club = sc.nextLine();

        return new Motociclisme(titular, redactor, club);
    }

    @Override
    public void calcularPreuNoticia() {
        float preu = 100f;
        preu = this.equip.equalsIgnoreCase("Honda") ||
                this.equip.equalsIgnoreCase("Yamaha") ? preu + 100f : preu;

        setPreu(preu);
    }

    @Override
    public void calcularPuntuacio() {
        int punts = 3;
        punts = this.equip.equalsIgnoreCase("Honda") ||
                this.equip.equalsIgnoreCase("Yamaha") ? punts + 3 : punts;

        setPuntuacio(punts);
    }

    @Override
    public String toString() {
        return "Notícia de motociclisme amb titular \"" + super.getTitular() + "\", puntuació de " +
                super.getPuntuacio() + " punts i un preu de " + super.getPreu() +
                " €. Fa referència a l'equip de " + this.equip +
                ".\nRedactor/a: " + super.getRedactor() +
                "\nText de la notícia: \"" + super.getText() + "\".";
    }
}
