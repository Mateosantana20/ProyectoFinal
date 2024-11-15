package Pk1;

public class Ingreso {

    private String nombre;
    private double monto;

    public Ingreso(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nMonto: " + monto;
    }
}
