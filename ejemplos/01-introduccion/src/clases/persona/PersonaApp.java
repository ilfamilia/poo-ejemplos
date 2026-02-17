package clases.persona;

public class PersonaApp {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.nombre = "Bruce";
        p.edad = 47;

        p.identificarse();
    }
}
