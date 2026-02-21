package getters_setters.validacion;

// Ejemplo de setter que valida los datos antes de asignarlos
public class Persona {

    private int edad;

    // Setter con validación
    void setEdad(int edad) {

        // Evita que se asignen edades inválidas
        if (edad < 0) {
            System.out.println("Edad inválida");
            return;
        }

        this.edad = edad;
    }

    int getEdad() {
        return edad;
    }
}
