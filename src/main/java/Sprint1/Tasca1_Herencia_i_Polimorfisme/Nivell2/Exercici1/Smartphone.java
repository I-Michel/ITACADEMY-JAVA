package Sprint1.Tasca1_Herencia_i_Polimorfisme.Nivell2.Exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto.");
    }
    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma.");
    }

    @Override
    public String toString() {
        return "Smartphone de la marca " + super.getMarca() + " i del model " + super.getModel() + ".";
    }
}
