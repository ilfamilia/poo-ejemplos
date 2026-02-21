package inclusion.tipo_base;

class Triangulo extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    @Override
    public void borrar() {
        System.out.println("Borrando triangulo");
    }
}
