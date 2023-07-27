public class TiendaHeladoVainilla extends TiendaPostres {
    @Override
    protected Postre crearPostre(){
        return new HeladoVainilla();
    }
}
