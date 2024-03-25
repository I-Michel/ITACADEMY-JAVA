package SPRINT1.Tasca7_Annotations.Nivell3;

@Serialitzador(directori = "output")
public class Paraula {
    private String nom;
    private String idioma;
    private final int numLletres;

    public Paraula(String nom, String idioma) {
        this.nom = nom;
        this.idioma = idioma;
        this.numLletres = nom.length();
    }

    public String getNom() {
        return nom;
    }
    public String getIdioma() {
        return idioma;
    }
    public int getNumLletres() {
        return numLletres;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Paraula " + this.nom + ", de l'idioma " + this.idioma + " amb " +
                this.numLletres + " lletres.";
    }
}