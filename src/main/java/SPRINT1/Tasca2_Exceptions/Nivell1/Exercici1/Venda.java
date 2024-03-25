package SPRINT1.Tasca2_Exceptions.Nivell1.Exercici1;

import java.util.ArrayList;

public class Venda {

    private ArrayList<Producte> llistaProductes = new ArrayList<Producte>();
    private float preuTotal;

    public Venda(ArrayList<Producte> llistaProductes) {
        this.llistaProductes = llistaProductes;
        this.preuTotal = 0f;
        calcularTotal();
    }

    public ArrayList<Producte> getLlistaProductes() {
        return llistaProductes;
    }

    public float getPreuTotal() {
        return preuTotal;
    }

    public void setPreuTotal(float preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void validarVenda(ArrayList<Producte> llistaProductes) throws VendaBuidaException {
        if (llistaProductes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
        }
    }

    public void calcularTotal() {
        try {
            validarVenda(this.llistaProductes);
            for (Producte producte : this.llistaProductes) {
                this.preuTotal += producte.getPreu();
            }
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        String resposta = "";
        for (Producte producte : this.llistaProductes) {
            resposta += "- " + producte.getNom() + ": " + producte.getPreu() + " € \n";
        }
        return "Productes de la venda: \n" + resposta + "Preu total: " + this.preuTotal + " €";
    }
}

