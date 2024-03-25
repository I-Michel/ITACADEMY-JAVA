package SPRINT1.Tasca2_Exceptions.Nivell1.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producte> llistaProductes1 = new ArrayList<Producte>();
        ArrayList<Producte> llistaProductes2 = new ArrayList<Producte>();
        int[] ArrayProva = new int[3];
        llistaProductes1.add(new Producte("Pasta de dents", 1.95f));
        llistaProductes1.add(new Producte("Garrafa d'aigua de 5L", 2.45f));
        llistaProductes1.add(new Producte("Macarrons 500g", 0.96f));
        llistaProductes1.add(new Producte("Barra de pà", 0.45f));

        Venda venda1 = new Venda(llistaProductes1);
        Venda venda2 = new Venda(llistaProductes2);

        System.out.println(llistaProductes1.get(2) + "\n\n" + venda1 + "\n\n" + venda1.getPreuTotal());
        venda1.calcularTotal();
        venda2.calcularTotal();
        System.out.println();

        try {
            ArrayProva[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. S'han sobrepassat els límits de l'Array.");
        }
    }
}
