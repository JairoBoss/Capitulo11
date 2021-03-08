package Ejercicio6;

public class WeekdaySubscriber extends NewspaperSubscriber{
    public WeekdaySubscriber(String direccion) {
        super(direccion);
    }

    @Override
    public Double setTarifa() {
        return 3.5;
    }
}
