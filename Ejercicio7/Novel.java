package Ejercicio7;

import java.util.Scanner;

public class Novel extends  Story{
    Scanner sc;
    public Novel(String titulo, String autor, String mensaje) {
        
        super(titulo, autor, mensaje);

        sc = new Scanner(System.in);
        
    }

    @Override
    public Integer setNoPaginas() {
        System.out.println("Introduce el numero de paginas");
        int x = sc.nextInt();
        if (x > 100){
            return x;
        }
        return 0;
    }
}
