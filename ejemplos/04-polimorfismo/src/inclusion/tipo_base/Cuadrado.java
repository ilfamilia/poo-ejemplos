package inclusion.tipo_base;

class Cuadrado extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadrado");
    }

    @Override
    public void borrar() {
        System.out.println("Borrando cuadrado");
    }
}
