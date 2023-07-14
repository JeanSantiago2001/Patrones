package Patrones.Composite;

public class ClientComposite {
    public ClientComposite(){

    }
    public static void main(String... args){
        Employee n1 = new Manager("Marc");
        Employee d1 = new Developer("Maria");
        Employee d2 = new Developer("Ema");
        Employee d3 = new Developer("Brian");
        n1.add(d1);
        n1.add(d2);
        n1.add(d3);
        Employee n2 = new Manager ("Susan");
        Employee d4 = new Developer("James");
        Employee d5 = new Developer("Michael");
        n2.add(d4);
        n2.add(d5);
    }
}
