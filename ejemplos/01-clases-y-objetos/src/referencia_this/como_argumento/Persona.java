package referencia_this.como_argumento;

class Persona {
    public void comer(Mango mango) {
        Mango pelado = mango.serPelado();
        System.out.println("Está bueno!");
    }
}
