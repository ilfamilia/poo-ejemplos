package genericos.sintaxis;

// Ejemplo básico de una clase genérica
// <T> representa un tipo que se define al crear el objeto
public class Caja<T> {

    private T objeto;

    // Permite guardar un objeto del tipo especificado
    public void set(T objeto) {
        this.objeto = objeto;
    }

    // Permite obtener el objeto guardado
    public T get() {
        return objeto;
    }
}

