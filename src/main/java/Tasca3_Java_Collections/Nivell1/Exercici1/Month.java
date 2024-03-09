package Tasca3_Java_Collections.Nivell1.Exercici1;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Month: " + this.name + ".";
    }
}
