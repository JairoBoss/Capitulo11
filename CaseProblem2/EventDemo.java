package CaseProblem2;

import java.util.ArrayList;
import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Event> eventos = new ArrayList<>();

        for (int i = 0; i < 1 ; i++) {
            System.out.println("Introduce el nombre del evento " + i+1 + ".");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el numero de telefono");
            String telefono = sc.nextLine();

            System.out.println("Ingrese el tipo de evento Modo de evento: [0]boda [1]bautizo [2]cumpleanios [3]empresarial [4]otro");
            int evento = sc.nextInt();

            eventos.add(new Event(nombre,telefono,evento));
        }

        for (int i = 0; i <eventos.size() ; i++) {
            System.out.println(eventos.get(i).getEvento());
            System.out.println(eventos.get(i).getNumeroDeTelefono());
            System.out.println(eventos.get(i).getNombreDeltipoDeEvento());

        }



    }
}