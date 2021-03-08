package Ejercicio3;

public class Test {
    public static void main(String[] args) {
        Auto a = new Ford("FORD");
        System.out.println(a.getPrecio());

        Auto b = new Nissan("NISSAN");
        System.out.println(b.getPrecio());
    }
}
