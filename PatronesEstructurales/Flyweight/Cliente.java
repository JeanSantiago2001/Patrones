package Flyweight;
// Clase Cliente
class Cliente {
    private final Figura figura;
    private final int x;
    private final int y;

    public Cliente(String color, int x, int y) {
        this.figura = FiguraFactory.getFigura(color);
        this.x = x;
        this.y = y;
    }

    public void dibujar() {
        figura.dibujar(x, y);
    }
}