package constructor.sin_argumentos;

public class PaginaApp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Cuando la clase define un constructor, el compilador ya no genera automáticamente
            // el constructor por defecto.
            new Pagina();
        }
    }
}
