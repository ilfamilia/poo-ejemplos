package acceso_paquete.paquete1;

// Tanto la clase como sus miembros(campos y metodos) tienen acceso de tipo paquete
// Revisar la clase Escritor para ver la explicación detallada
class Lapiz {
    int cantidadPunta = 3;

    void usar(String mensaje) {
        if (cantidadPunta > 0) {
            System.out.println(mensaje);
            cantidadPunta--;
        } else {
            System.out.println("Recargue punta");
        }
    }
}
