package acceso_privado.paquete1;

// Esta clase no tiene acceso al constructor de la clase Helado porque es privado
public class HeladeriaApp {
    public static void main(String[] args) {
        //! Helado helado = new Helado();

        Helado helado = Helado.hacerHelado();
    }
}
