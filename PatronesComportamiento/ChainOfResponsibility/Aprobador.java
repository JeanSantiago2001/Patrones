package ChainOfResponsibility;

public interface Aprobador {
    void setSiguiente(Aprobador siguiente);
    void procesarSolicitud(Solicitud solicitud);

}
