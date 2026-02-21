package getters_setters.sintaxis;

// Ejemplo básico de encapsulamiento usando getters y setters
public class Persona {

    // Campos privados: no se pueden acceder directamente desde otras clases
    private String nombre;
    private int edad;

    // Setter: permite asignar un valor al campo nombre de forma controlada
    void setNombre(String nombre) { this.nombre = nombre; }

    // Setter: permite asignar un valor al campo edad
    void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter: permite obtener el valor del campo nombre
    String getNombre() {
        return nombre;
    }

    // Getter: permite obtener el valor del campo edad
    int getEdad() {
        return edad;
    }
}
