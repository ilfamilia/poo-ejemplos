package referencia_this.como_miembro;

class Basquetbolista {
    String nombre;
    String posicion;
    int numero;

    Basquetbolista(String nombre, String posicion, int numero) {
        // Este ejemplo muestra como this puede ser usado para resolver la ambiguedad
        // entre los datos miembros de la clase y la lista de argumentos del constructor
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Número: " + numero);
    }
}
