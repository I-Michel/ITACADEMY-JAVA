package Tasca4_Testing.Nivell1.Exercici1;

import java.util.ArrayList;

public class Mes {

    private final String nom;

    public Mes(String name) {
        this.nom = name;
    }

    public String getNom() {
        return nom;
    }

    public static void generarLlistaMesos(ArrayList<Mes> mesos) {
        mesos.add(new Mes("gener"));
        mesos.add(new Mes("febrer"));
        mesos.add(new Mes("març"));
        mesos.add(new Mes("abril"));
        mesos.add(new Mes("maig"));
        mesos.add(new Mes("juny"));
        mesos.add(new Mes("juliol"));
        mesos.add(new Mes("agost"));
        mesos.add(new Mes("setembre"));
        mesos.add(new Mes("octubre"));
        mesos.add(new Mes("novembre"));
        mesos.add(new Mes("desembre"));
    }

    @Override
    public String toString() {
        return "Mes: " + this.nom;
    }
}
