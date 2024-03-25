package Sprint1.Tasca4_Testing.Nivell1.Exercici2;

public class Main {
    public static void main(String[] args) {

        // DNI generado: 34582435A
       CalculoDNI dni1 = new CalculoDNI(34582435);

        System.out.println(dni1.getNUM_DNI() + "-" + dni1.calcularLletra());
        System.out.println(dni1);

    }
}
