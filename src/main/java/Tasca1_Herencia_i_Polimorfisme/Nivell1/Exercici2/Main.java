package Tasca1_Herencia_i_Polimorfisme.Nivell1.Exercici2;

public class Main {

    public static void main(String[] args) {

        Cotxe cotxe1 = new Cotxe(329);

        System.out.println(cotxe1);
        System.out.println(cotxe1.toString());
        System.out.println("Tinc un cotxe " + cotxe1.getMARCA() + " " + cotxe1.getModel() +
                            " amb una potència de " + cotxe1.getPOTENCIA() + " CV.");

        System.out.println(cotxe1.accelerar() + "\n" + cotxe1.frenar());
    }
}


