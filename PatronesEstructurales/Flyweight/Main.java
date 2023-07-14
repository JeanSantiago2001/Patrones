package Flyweight;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("rojo", 10, 10);
        Cliente cliente2 = new Cliente("azul", 20, 20);
        Cliente cliente3 = new Cliente("rojo", 30, 30);
        Cliente cliente4 = new Cliente("azul", 40, 40);

        cliente1.dibujar();
        cliente2.dibujar();
        cliente3.dibujar();
        cliente4.dibujar();
    }
}
