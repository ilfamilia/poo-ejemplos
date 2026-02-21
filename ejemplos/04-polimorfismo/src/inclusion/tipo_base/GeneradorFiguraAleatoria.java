package inclusion.tipo_base;

import java.util.Random;

// Produce una referencia a un objeto aleatorio de tipo Figura
public class GeneradorFiguraAleatoria {
    private Random rand = new Random(23);

    public Figura proximo() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circulo();
            case 1: return new Cuadrado();
            case 2: return new Triangulo();
        }
    }
}
