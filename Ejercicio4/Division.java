package Ejercicio4;

public abstract class Division {
    private String nombre;
    private Integer noCuenta;

    public Division(String nombre, Integer noCuenta) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
    }

    public abstract void visualizacion();

}
