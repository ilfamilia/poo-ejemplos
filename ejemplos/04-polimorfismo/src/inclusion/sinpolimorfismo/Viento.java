package inclusion.sinpolimorfismo;

class Viento extends Instrumento {
    @Override
    public void tocar(String nota) {
        System.out.println("Viento toca nota: " + nota);
    }
}
