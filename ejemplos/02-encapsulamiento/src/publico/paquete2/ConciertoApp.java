package publico.paquete2;

import publico.paquete1.Cantante;

// Accede a la clase Cantante que se encuentra en otro paquete
public class ConciertoApp {
    public static void main(String[] args) {
        Cantante cantante = new Cantante();

        //! cantante.cantar(); // No se puede acceder porque no es público
    }
}
