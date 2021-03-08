package Ejercicio10;

public class Cuadrado extends GeometricFigure{
    public Cuadrado(Integer altura, Integer ancho) {
        super(altura, ancho, "Cuadrado");
    }

    @Override
    public Double setArea() {
        return new Double(getAltura() * getAncho());
    }


}
