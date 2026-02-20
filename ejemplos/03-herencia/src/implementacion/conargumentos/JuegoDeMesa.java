package implementacion.conargumentos;

class JuegoDeMesa extends Juego {
    JuegoDeMesa(int i) {
        // Forma correcta de llamar el constructor de la clase base.
        // Si el constructor de la clase base no se llama, y no tiene
        // Una version sin parámetros entonces obtendremos un error
        // en tiempo de compilación.
        super(i);
        System.out.println("Constructor de juego de mesa");
    }
}
