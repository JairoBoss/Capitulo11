package Ejercicio11;

public class Triangulo extends GeometricFigure {
    public Triangulo(Integer altura, Integer ancho) {
        super(altura, ancho,"triangulo");
    }

    @Override
    public Double setArea() {
        return new Double((getAltura() * getAncho())/2);
    }

    @Override
    public void displaySides() {
        System.out.println("Tiene 3 lados");
    }
}
