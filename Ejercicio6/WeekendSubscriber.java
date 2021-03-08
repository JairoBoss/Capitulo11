package Ejercicio6;

public class WeekendSubscriber extends NewspaperSubscriber{
    public WeekendSubscriber(String direccion) {
        super(direccion);
    }

    @Override
    public Double setTarifa() {
        return 2.0;
    }
}
