package implementacion.inicializacion;

// Cuando se cree un objeto de tipo Acrilico, de forma implícita
// se creará un sub objeto de tipo Pintura, y como Pintura hereda de
// Arte, también se creará un sub objeto de tipo Arte
class Acrilico extends Pintura {
    Acrilico() {
        System.out.println("Constructor de acrílico");
    }
}
