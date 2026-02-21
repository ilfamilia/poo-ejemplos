package metodos.estaticos;

public class Incrementador {

    // Creación de metodo estático dentro de la clase
    // Ojo: no se pueden llamar métodos no estáticos desde métodos estáticos
    static void incrementar() {
        PruebaStatic.i++;
    }
}
