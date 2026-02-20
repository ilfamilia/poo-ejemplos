package inclusion.extensibilidad;

class Cuerda extends Instrumento {

    @Override
    void tocar(String nota) {
        System.out.println("Cuerda toca: " + nota);
    }

    @Override
    String identificar() {
        return "Cuerda";
    }

    @Override
    void ajustar() {
        System.out.println("Cuerda Viento");
    }

}
