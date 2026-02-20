package implementacion.sintaxis;

// Haciendo pruebas con la clase derivada
public class AtletaApp {
    public static void main(String[] args) {
        Boxeador b = new Boxeador();
        b.correr(); // Heredado tal cual
        b.saltar(); // Sobreescrito
        b.pelear(); // Metodo propio
    }
}
