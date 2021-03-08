package Ejercicio3;

public abstract class Auto {
    private String Marca;
    private Integer precio;

    public Auto(String a){
        this.Marca = a;
        this.precio = setPrecio();
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public abstract Integer setPrecio();
}
