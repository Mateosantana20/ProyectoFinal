package Pk1;

public class Gasto {

    private String tipo;
    private String nombre;
    private double monto;

    public Gasto(String tipo, String nombre, double monto) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    public String toString() {
        return "Tipo: " + tipo + "\nNombre: " + nombre + "\nMonto: " + monto;
    }
}
