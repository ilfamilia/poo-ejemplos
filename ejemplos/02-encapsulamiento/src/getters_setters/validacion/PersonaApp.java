package getters_setters.validacion;

public class PersonaApp {

    public static void main(String[] args) {

        Persona p = new Persona();

        p.setEdad(25);
        System.out.println("Edad: " + p.getEdad());

        p.setEdad(-10); // valor inválido
        System.out.println("Edad: " + p.getEdad());
    }
}
