package Ejercicio1;

public class Test {
    public static void main(String[] args) {
        Book a = new Ficción("TITULO");
        System.out.println(a.toString());

        Book b = new NoFiccion("LIBRO");
        System.out.println(b.toString());

    }
}
