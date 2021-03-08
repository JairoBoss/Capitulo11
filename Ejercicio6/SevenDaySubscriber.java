package Ejercicio6;

public class SevenDaySubscriber extends NewspaperSubscriber{
    public SevenDaySubscriber(String direccion) {
        super(direccion);
    }

    @Override
    public Double setTarifa() {
        return 4.5;
    }
}
