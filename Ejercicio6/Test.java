package Ejercicio6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu direccion crack");
        String x = sc.nextLine();

        NewspaperSubscriber a = new SevenDaySubscriber(x);
        System.out.println(x.toString());


    }
}
