package Ejercicio11;

public abstract class GeometricFigure extends SidedObject {
    private Integer altura;
    private Integer ancho;
    private String tipo;
    private Double area;

    public GeometricFigure(Integer altura, Integer ancho, String tipo) {
        this.altura = altura;
        this.ancho = ancho;
        this.tipo = tipo;
        this.area = setArea();
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", tipo='" + tipo + '\'' +
                ", area=" + area +
                '}';
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getAncho() {
        return ancho;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getArea() {
        return area;
    }

    public abstract Double setArea();
}
