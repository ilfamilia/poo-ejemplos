package getters_setters.sintaxis;

public class PersonaApp {
    public static void main(String[] args) {
        Persona p = new Persona();

        // No se puede acceder directamente porque los campos son private
        //! p.nombre = "Bruce";
        //! p.edad = 47;

        // Se usan los setters para asignar valores
        p.setNombre("Bruce");
        p.setEdad(47);

        // Se usan los getters para leer los valores
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
    }
}
