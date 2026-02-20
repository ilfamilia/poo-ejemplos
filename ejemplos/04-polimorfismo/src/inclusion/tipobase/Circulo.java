package inclusion.tipobase;

class Circulo extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    @Override
    public void borrar() {
        System.out.println("Borrando circulo");
    }
}
