package Flyweight;

import java.util.HashMap;
// Clase FlyweightFactory
class FiguraFactory {
    private static final HashMap<String, Figura> figuras = new HashMap<>();

    public static Figura getFigura(String color) {
        Figura figura = figuras.get(color);

        if (figura == null) {
            figura = new Circulo(color);
            figuras.put(color, figura);
        }

        return figura;
    }
}
