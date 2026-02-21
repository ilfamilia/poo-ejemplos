package genericos.tipo_base;

// Clase genérica que almacena dos objetos del mismo tipo
// El tipo T se define al crear el objeto
public class Par<T> {

    private T primero;
    private T segundo;

    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }

    public void mostrarTipos() {
        System.out.println("Tipo: " + primero.getClass().getSimpleName());
    }
}
