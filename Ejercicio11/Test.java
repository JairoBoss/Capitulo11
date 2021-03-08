package Ejercicio11;

public class Test {
    public static void main(String[] args) {
        GeometricFigure a = new Cuadrado(10,2);
        System.out.println(a.toString());

        GeometricFigure b = new Triangulo(2,2);
        System.out.println(b.toString());
    }
}
