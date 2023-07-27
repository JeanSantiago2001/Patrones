public class TiendaPastelChocolate extends TiendaPostres {
    @Override
    protected Postre crearPostre(){
        return new PastelChocolate();
    }
}
