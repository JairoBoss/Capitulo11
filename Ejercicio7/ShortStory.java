package Ejercicio7;

import java.util.Scanner;

public class ShortStory extends Story{
    Scanner sc = new Scanner(System.in);

    public ShortStory(String titulo, String autor, String mensaje) {
        super(titulo, autor, mensaje);
        //setNoPaginas();
    }

    @Override
    public Integer setNoPaginas() {
        System.out.println("Introduce el numero de paginas");
        int x = sc.nextInt();
        if (x >= 50 && x<=100){
            return x;
        }
        return null;
    }
}
