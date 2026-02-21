package constructor.por_defecto;

public class MuestraApp {
    public static void main(String[] args) {
        // El compilador genera automáticamente un constructor por defecto cuando la clase
        // no define ninguno. Este constructor inicializa los campos con sus valores por defecto.
        Muestra m1 = new Muestra();

        // Los campos de la clase son inicializados automáticamente con valores por defecto
        System.out.println("Mostrando valores por defecto:");
        System.out.println("i: " + m1.i);
        System.out.println("s: " + m1.s);
        System.out.println("b: " + m1.b);
    }
}
