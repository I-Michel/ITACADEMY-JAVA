package Sprint1.Tasca5_Java_Utils.Nivell1.Exercici5;

import java.io.*;

public class Registro implements Serializable {
    private String nombre;
    private String tipo;
    private String fecha;

    public Registro(String nombre, String tipo, String fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public String getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.tipo + " con nombre \"" + this.nombre + "\" y última fecha de modificación el " +
                this.fecha + ".";
    }
}
