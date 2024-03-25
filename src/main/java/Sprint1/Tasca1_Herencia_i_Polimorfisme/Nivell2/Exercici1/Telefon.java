package Sprint1.Tasca1_Herencia_i_Polimorfisme.Nivell2.Exercici1;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void trucar(String numeroTelf) {
        System.out.println("S'està trucant al número de telèfon " + numeroTelf + ".");
    }

    @Override
    public String toString() {
        return "Telèfon de la marca " + this.marca + " i del model " + this.model + ".";
    }
}
