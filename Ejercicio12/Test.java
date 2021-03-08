package Ejercicio12;

public class Test {
    public static void main(String[] args) {
        Player a = new Child();
        a.play();

        Player b = new Musician();
        b.play();

        Player c = new Actor();
        c.play();
    }
}
