public class HeladoVainilla implements Postre {
    @Override
    public void preparar(){
        System.out.println("Preparand un Helado de Vainilla");
    }

    @Override
    public void servir(){
        System.out.println("Sirviendo un Helado de Vainilla");
    }
}
