package Ejercicio10;

public class Triangulo extends GeometricFigure{
    public Triangulo(Integer altura, Integer ancho) {
        super(altura, ancho,"triangulo");
    }

    @Override
    public Double setArea() {
        return new Double((getAltura() * getAncho())/2);
    }
}
