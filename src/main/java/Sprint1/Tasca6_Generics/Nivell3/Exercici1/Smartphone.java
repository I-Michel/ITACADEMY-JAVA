package Sprint1.Tasca6_Generics.Nivell3.Exercici1;

public class Smartphone implements Phone {
    private String name;
    private int num;

    public Smartphone(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void call() {
        System.out.println("* " + this.name + "\'s smartphone is calling *");
    }

    public void takePictures() {
        System.out.println("* " + this.name + "\'s smartphone is taking pictures *");
    }

    @Override
    public String toString() {
        return this.name + "\'s smartphone with number " + this.num + ".";
    }
}
