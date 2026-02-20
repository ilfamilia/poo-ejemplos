package sobrecarga.sintaxis;

// Hace uso de la clase Mensaje para demostrar el polimorfismo por sobrecarga
public class MensajeApp {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();

        mensaje.enviar();
        mensaje.enviar(3);
        mensaje.enviar("Mensaje personalizado");
        mensaje.enviar("String primero y luego int", 2);
        mensaje.enviar(2, "int primero y luego String");
    }
}
