package referenciathis.retornar;

class Moneda {
    int i;

    // Ejemplo sencillo de metodo que devuelve una referencia al objeto actual
    // Ojo: this NO se puede usar dentro de metodos static
    Moneda incrementar() {
        i++;
        return this;
    }

    void mostrar() {
        System.out.println("i = " + i);
    }
}
