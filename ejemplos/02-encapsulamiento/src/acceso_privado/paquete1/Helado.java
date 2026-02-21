package acceso_privado.paquete1;

// Ejemplo de uso del acceso de tipo privado
class Helado {
    // Solo se puede acceder al constructor dentro de esta clase
    private Helado() {
        System.out.println("Hecho con la receta secreta");
    }

    // este metodo hace uso del constructor
    static Helado hacerHelado() {
        return new Helado();
    }
}
