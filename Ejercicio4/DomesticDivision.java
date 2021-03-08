package Ejercicio4;

public class DomesticDivision extends Division{
    private String estado;

    public DomesticDivision(String nombre, Integer noCuenta, String estado) {
        super(nombre, noCuenta);
        this.estado = estado;
    }

    @Override
    public void visualizacion() {
        System.out.println("DomesticDivision{" +
                "estado='" + estado + '\'' +
                '}');
    }


}
