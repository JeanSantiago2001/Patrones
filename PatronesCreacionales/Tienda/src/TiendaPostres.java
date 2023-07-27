abstract class TiendaPostres {
    public void venderPostre(){
        Postre postre = crearPostre();
        postre.preparar();
        postre.servir();
    }

    //Factory Method
    protected abstract Postre crearPostre();
}
