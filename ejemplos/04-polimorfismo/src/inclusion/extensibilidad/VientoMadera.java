package inclusion.extensibilidad;

class VientoMadera extends Viento {

    @Override
    void tocar(String nota) {
        System.out.println("VientoMadera toca: " + nota);
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando VientoMadera");
    }

}
