package SPRINT1.Tasca3_Java_Collections.Nivell2.Exercici1;

import java.util.Objects;

public class Restaurant {

    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant) || obj == null) return false;
        Restaurant restaurantNou = (Restaurant) obj;
        return this.puntuacio == restaurantNou.getPuntuacio() && this.nom.equals(restaurantNou.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public String toString() {
        return "Restaurant " + this.nom + " amb " + this.puntuacio + " punts.";
    }
}