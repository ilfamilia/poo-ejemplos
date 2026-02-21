package acceso_paquete.paquete1;

// Tanto la clase como sus miembros(campos y metodos) tienen acceso de tipo paquete
// Revisar la clase Escritor para ver la explicación detallada
class Papel {
    int cantidadEspacio = 3;

    boolean tieneEspacio() {
        return cantidadEspacio > 0;
    }

    void usar() {
        cantidadEspacio--;
    }
}
