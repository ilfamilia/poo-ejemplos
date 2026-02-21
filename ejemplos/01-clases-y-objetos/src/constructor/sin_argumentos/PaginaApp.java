package constructor.sin_argumentos;

public class PaginaApp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Cuando hay un constructor en la clase el constructor por defecto no es utilizado
            new Pagina();
        }
    }
}
