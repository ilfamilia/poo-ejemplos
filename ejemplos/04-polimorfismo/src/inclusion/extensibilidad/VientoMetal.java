package inclusion.extensibilidad;

class VientoMetal extends Viento {

    @Override
    void tocar(String nota) {
        System.out.println("VientoMetal toca: " + nota);
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando VientoMetal");
    }

}
