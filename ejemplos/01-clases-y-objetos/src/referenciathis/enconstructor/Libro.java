package referenciathis.enconstructor;

class Libro {
    int paginas;
    String nombre;
    String autor;
    boolean esBestSeller;

    Libro(int pag, String nom, String aut, boolean ebs) {
        paginas = pag;
        nombre = nom;
        autor = aut;
        esBestSeller = ebs;
    }

    Libro() {
        // Esta forma de this solo funciona en el constructor en un metodo normal dará error
        // Solo se puede hacer una vez por constructor aunque tengamos muchas sobrecargas
        // Evita tener que repetir código
        this(0, "Vacío", "Anónimo", false);
    }

    void mostrarDatos() {
        System.out.println("Páginas: " + paginas);
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Best seller: " + esBestSeller);
    }
}
