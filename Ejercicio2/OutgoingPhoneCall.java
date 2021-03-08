package Ejercicio2;

public class OutgoingPhoneCall extends PhoneCall{

    public OutgoingPhoneCall(String noTelefono) {
        super(noTelefono);
    }

    @Override
    public Double precio() {
        return null;
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
