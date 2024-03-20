package Tasca7_Annotations.Nivell1.Exercici2;

public abstract class Treballador {

    protected String nom;
    protected String cognom;
    protected float preuHora;

    public Treballador(String nom, String cognom, float preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }
    public float getPreuHora() {
        return preuHora;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setPreuHora(float preuHora) {
        this.preuHora = preuHora;
    }

    public abstract float calcularSou(int hores);

    @Override
    public String toString() {
        return "Treballador " + this.nom + " " + this.cognom + " amb un sou de " +
                this.preuHora + " euros per hora treballada.";
    }
}
