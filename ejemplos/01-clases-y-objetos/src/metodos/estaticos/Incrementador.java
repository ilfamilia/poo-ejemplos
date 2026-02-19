package metodos.estaticos;

public class Incrementador {

    // Creación de metodo estático dentro de la clase
    // Ojo: no se puede llamar metodos no estáticos dentro de metodos estáticos
    static void incrementar() {
        PruebaStatic.i++;
    }
}
