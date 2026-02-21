package referencia_this.retornar;

public class MonedaApp {
    public static void main(String[] args) {
        Moneda m = new Moneda();

        // Como incrementar devuelve una referencia al objeto actual
        // se pueden realizar multiples operaciones
        m.incrementar().incrementar().incrementar().mostrar();
    }
}
