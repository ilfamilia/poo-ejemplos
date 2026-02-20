package inclusion.sinpolimorfismo;

class Percusion extends Instrumento{
    @Override
    public void tocar(String nota) {
        System.out.println("Percusión toca nota: " + nota);
    }
}
