package inclusion.extensibilidad;

class Percusion extends Instrumento {

    @Override
    void tocar(String nota) {
        System.out.println("Percusion toca: " + nota);
    }

    @Override
    String identificar() {
        return "Percusion";
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando Percusion");
    }

}