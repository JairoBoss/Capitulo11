package Ejercicio11;

public class Cuadrado extends GeometricFigure {
    public Cuadrado(Integer altura, Integer ancho) {
        super(altura, ancho, "Cuadrado");
    }

    @Override
    public Double setArea() {
        return new Double(getAltura() * getAncho());
    }


    @Override
    public void displaySides() {
        System.out.println("Tiene 4 lados");
    }
}
