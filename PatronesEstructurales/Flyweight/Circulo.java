package Flyweight;
// Clase Flyweight concreta
class Circulo implements Figura {
    private String color;

    public Circulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando un círculo de color " + color + " en las coordenadas (" + x + ", " + y + ")");
    }
}