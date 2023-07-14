package ChainOfResponsibility;

public class Solicitud {

    private double monto;

    public Solicitud(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}
