package Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.Scanner;

public abstract class Noticia {
    protected Redactor redactor;
    protected String titular;
    protected String text;
    protected int puntuacio;
    protected float preu;

    public Noticia(String titular, Redactor redactor) {
        this.redactor = redactor;
        this.titular = titular;
        this.text = "";
    }

    public Redactor getRedactor() {
        return redactor;
    }
    public String getTitular() {
        return titular;
    }
    public String getText() {
        return text;
    }
    public int getPuntuacio() {
        return puntuacio;
    }
    public float getPreu() {
        return preu;
    }

    public void setRedactor(Redactor redactor) {
        this.redactor = redactor;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }

    public abstract void calcularPreuNoticia();

    public abstract void calcularPuntuacio();

    @Override
    public String toString() {
        return "Notícia amb titular \"" + this.titular + "\", puntuació de " + this.puntuacio +
                " punts i un preu de " + this.preu + " €. \nRedactor/a: " + this.redactor + "." +
                "\nText de la notícia: \"" + this.text + "\".";
    }
}