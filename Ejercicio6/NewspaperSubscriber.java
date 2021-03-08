package Ejercicio6;

import java.util.Objects;

public abstract class NewspaperSubscriber {
    private String direccion;
    private Double tarifa;

    public NewspaperSubscriber(String direccion) {
        this.direccion = direccion;
        this.tarifa = setTarifa();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "NewspaperSubscriber{" +
                "direccion='" + direccion + '\'' +
                ", tarifa=" + tarifa +
                '}';
    }

    public abstract Double setTarifa();

    public void equals(NewspaperSubscriber a){
        if (this.direccion == a.direccion){
            System.out.println("Iguales");
        }else {
            System.out.println("No son iguales xd");
        }
    }
}
