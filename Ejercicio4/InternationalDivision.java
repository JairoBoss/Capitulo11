package Ejercicio4;

public class InternationalDivision extends Division{
    private String pais;
    private String idioma;
    public InternationalDivision(String nombre, Integer noCuenta, String pais, String x) {
        super(nombre, noCuenta);
        this.pais = pais;
        this.idioma = x;
    }

    @Override
    public void visualizacion() {
        System.out.println("InternationalDivision{" +
                "pais='" + pais + '\'' +
                ", idioma='" + idioma + '\'' +
                '}');
    }
}
