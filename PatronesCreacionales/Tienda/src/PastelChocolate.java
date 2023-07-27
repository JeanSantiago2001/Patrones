public class PastelChocolate implements Postre {
    @Override
    public void preparar(){
        System.out.println("Preparando un pastel de chocolate");
    }

    @Override
    public void servir(){
        System.out.println("Sirviendo un pastel de chocolate");
    }
}
