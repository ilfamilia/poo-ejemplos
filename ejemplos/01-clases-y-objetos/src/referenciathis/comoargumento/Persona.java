package referenciathis.comoargumento;

class Persona {
    public void comer(Mango mango) {
        Mango pelado = mango.serPelado();
        System.out.println("Está bueno!");
    }
}
