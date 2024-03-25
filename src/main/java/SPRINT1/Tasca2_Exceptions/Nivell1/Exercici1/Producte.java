package SPRINT1.Tasca2_Exceptions.Nivell1.Exercici1;

public class Producte {

    private String nom;
    private float preu;

    public Producte(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }
    public float getPreu() {
        return preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Producte: " + this.nom + " (" + this.preu + " €)";
    }
}
