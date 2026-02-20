package inclusion.extensibilidad;

class Viento extends Instrumento {

    @Override
    void tocar(String nota) {
        System.out.println("Viento toca: " + nota);
    }

    @Override
    String identificar() {
        return "Viento";
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando Viento");
    }

}
