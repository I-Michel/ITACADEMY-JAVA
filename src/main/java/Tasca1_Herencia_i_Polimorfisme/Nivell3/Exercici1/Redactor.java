package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.ArrayList;

public class Redactor {
    private String nom;
    private final String DNI;
    private static float sou;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        sou = 1500f;
        this.noticies = new ArrayList<Noticia>();
    }

    public String getNom() {
        return nom;
    }
    public String getDNI() {
        return DNI;
    }
    public static float getSou() {
        return sou;
    }
    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public static void setSou(float sou) {
        Redactor.sou = sou;
    }

    @Override
    public String toString() {
        return this.nom + " amb DNI " + this.DNI + " i un sou de " +
                sou + " € mensuals.";
    }


}