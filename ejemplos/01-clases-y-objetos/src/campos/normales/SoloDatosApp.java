package campos.normales;

public class SoloDatosApp {
    public static void main(String[] args) {

        SoloDatos datos = new SoloDatos();

        // Asignación y lectura de campos de instancia.
        datos.s = "Prueba";
        datos.i = 12;
        datos.b = true;

        System.out.println("Mostrando datos:");
        System.out.println("s: " + datos.s);
        System.out.println("i: " + datos.i);
        System.out.println("b: " + datos.b);
    }
}
