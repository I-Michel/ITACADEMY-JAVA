package Sprint1.Tasca6_Generics.Nivell2.Exercici1;

public class Persona {

    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }
    public int getEdat() {
        return edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona amb nom i cognom " + this.nom + " " + this.cognom +
                " i " + this.edat + " anys d'edat.";
    }
}
