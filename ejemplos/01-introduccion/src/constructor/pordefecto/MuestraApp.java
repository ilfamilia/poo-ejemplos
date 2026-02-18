package constructor.pordefecto;

public class MuestraApp {
    public static void main(String[] args) {
        // El compilador llamará al constructor por defecto ya que no se especificó uno en la clase
        Muestra m1 = new Muestra();

        // Muestra como los campos de la clase han sido inicializados con valores por defecto
        // por el constructor para evitar errores de memoria al leer variables no asignadas
        System.out.println("Mostrando valores por defecto:");
        System.out.println("i: " + m1.i);
        System.out.println("s: " + m1.s);
        System.out.println("b: " + m1.b);
    }
}
