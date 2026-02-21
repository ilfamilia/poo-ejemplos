package acceso_paquete.paquete1;

// Esta clase hace uso de otras dos clases que tienen acceso de paquete
// Debido a que esta clase pertenece al mismo paquete, puede acceder a las otras
// Dos clases sin ningún inconveniente
class Escritor {
    Lapiz lapiz;
    Papel papel;

    Escritor() {
        lapiz = new Lapiz();
        papel = new Papel();

        // Escritor también puede acceder a los campos de la clase Lapiz y Papel
        // Ya que también tienen acceso de paquete
        lapiz.cantidadPunta = 2;
        papel.cantidadEspacio = 4;
    }

    void escribir(String mensaje) {
        if (papel.tieneEspacio()) {
            lapiz.usar(mensaje);
            papel.usar();
        } else {
            System.out.println("No hay espacio en el papel");
        }
    }
}
