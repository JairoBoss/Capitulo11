package Ejercicio8;

public class DemoTurnes {
    public static void main(String[] args) {
        Turner a = new Leaf();
        a.turn();

        Turner b = new Pagina();
        b.turn();

        Turner c = new Pancake();
        c.turn();

        Turner d = new Tornillo();
        d.turn();

        Turner e = new Perilla();
        e.turn();
    }
}
