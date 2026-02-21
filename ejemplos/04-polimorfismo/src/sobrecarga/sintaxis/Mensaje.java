package sobrecarga.sintaxis;

// Esta clase sirve como ejemplo del polimorfismo por sobrecarga
// o polimorfismo en tiempo de compilación
class Mensaje {

    // Imprime mensaje genérico
    public void enviar() {
        System.out.println("Mensaje genérico");
    }

    // Repite el mensaje genérico n veces
    public void enviar(int nVeces) {
        for (int i = 0; i < nVeces; i++) {
            System.out.println((i + 1) + ". Mensaje genérico");
        }
    }

    // Imprime un mensaje personalizado
    public void enviar(String mensaje) {
        System.out.println(mensaje);
    }

    // Los siguientes dos metodos muestran que se puede
    // implementar la sobrecarga cambiando el orden de
    // la lista de argumentos. Aunque esta práctica no
    // es recomendable.

    // Los metodos imprimen un mensaje personalizado n cantidad de veces

    public void enviar(String mensaje, int nVeces) {
        for (int i = 0; i < nVeces; i++) {
            System.out.println((i + 1) + ". " + mensaje);
        }
    }

    public void enviar(int nVeces, String mensaje) {
        for (int i = 0; i < nVeces; i++) {
            System.out.println((i + 1) + ". " + mensaje);
        }
    }
}
