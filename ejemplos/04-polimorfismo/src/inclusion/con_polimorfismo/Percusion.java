package inclusion.con_polimorfismo;

class Percusion extends Instrumento {
    @Override
    public void tocar(String nota) {
        System.out.println("Percusión toca nota: " + nota);
    }
}
