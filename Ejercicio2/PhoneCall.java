package Ejercicio2;

public abstract class PhoneCall {
    private String noTelefono;
    private Double precioXLlamada;

    public PhoneCall(String noTelefono) {
        this.noTelefono = noTelefono;
        this.precioXLlamada = precio();
    }

    public abstract Double precio();

    public abstract Double noTelefono();

    public abstract Double info();

    @Override
    public String toString() {
        return "PhoneCall{" +
                "noTelefono='" + noTelefono + '\'' +
                ", precioXLlamada=" + precioXLlamada +
                '}';
    }
}
