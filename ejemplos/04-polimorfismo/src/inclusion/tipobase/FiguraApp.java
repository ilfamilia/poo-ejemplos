package inclusion.tipobase;

// Contiene un array de tipo Figura que se llena con el generador de figuras aleatorias
public class FiguraApp {

    private static GeneradorFiguraAleatoria gen = new GeneradorFiguraAleatoria();

    public static void main(String[] args) {
        Figura[] figuras = new Figura[9];
        
        //Llena el array con formas
        for (int i = 0; i < figuras.length; i++) {
            figuras[i] = gen.proximo();
        }

        // Hace llamadas polimórficas al metodo
        for(Figura f : figuras) {
            f.dibujar();
        }
    }
}
