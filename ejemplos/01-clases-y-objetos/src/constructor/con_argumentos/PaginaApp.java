package constructor.con_argumentos;

public class PaginaApp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Si se define un constructor con parámetros, el compilador ya no genera
            // automáticamente el constructor por defecto.
            // Si necesitamos un constructor sin argumentos, debemos declararlo explícitamente.
            new Pagina(i);
        }
    }
}
