public class Main {
    public static void main(String[] args) {

        TiendaPostres tiendaPastel = new TiendaPastelChocolate();
        TiendaPostres tiendaHelado = new TiendaHeladoVainilla();

        tiendaPastel.venderPostre();
        System.out.println("");
        tiendaHelado.venderPostre();
        System.out.println("");
        tiendaPastel.venderPostre();
        System.out.println("");
        tiendaPastel.venderPostre();
        System.out.println("");
        tiendaHelado.venderPostre();
    }
}