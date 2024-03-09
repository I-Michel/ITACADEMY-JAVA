package Tasca6_Generics.Nivell1.Exercici1;

public class NoGenericMethods {

    private Persona pax1;
    private Persona pax2;
    private Persona pax3;

    public NoGenericMethods(Persona pax1, Persona pax2, Persona pax3) {
        this.pax1 = pax1;
        this.pax2 = pax2;
        this.pax3 = pax3;
    }

    public Persona getPax1() {
        return pax1;
    }
    public Persona getPax2() {
        return pax2;
    }
    public Persona getPax3() {
        return pax3;
    }

    public void setPersona1(Persona pax1) {
        this.pax1 = pax1;
    }
    public void setPax2(Persona pax2) {
        this.pax2 = pax2;
    }
    public void setPax3(Persona pax3) {
        this.pax3 = pax3;
    }

    public String toString() {
        return "\nAquest NoGenericMethods conté:\n- " + this.pax1 + "\n- " +
                this.pax2 + "\n- " + this.pax3;
    }
}