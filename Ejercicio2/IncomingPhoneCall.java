package Ejercicio2;

public class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String noTelefono) {
        super(noTelefono);

    }

    @Override
    public Double precio() {
        return 59.6;
    }

    @Override
    public Double noTelefono() {
        return null;
    }

    @Override
    public Double info() {
        return null;
    }

}
