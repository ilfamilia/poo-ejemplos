package inclusion.extensibilidad;

class Instrumento {

    void tocar(String nota) {
        System.out.println("Instrumento toca: " + nota);
    }

    String identificar() {
        return "Instrumento";
    }

    void ajustar() {
        System.out.println("Ajustando Instrumento");
    }
}
