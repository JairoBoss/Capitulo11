package Ejercicio1;

public abstract class Book {
    private String nombre;
    private Double precio;

    public Book(String nomrbe) {
        this.nombre = nomrbe;
        this.precio = setPrecio();
    }

    public String getNomrbe() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public abstract Double setPrecio();

    @Override
    public String toString() {
        return "Book{" +
                "nomrbe='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
