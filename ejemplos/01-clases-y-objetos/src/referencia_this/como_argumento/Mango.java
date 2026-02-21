package referencia_this.como_argumento;

class Mango {
    Mango serPelado() {

        // Aqui se pasa this como argumento de un metodo externo
        return Pelador.pelar(this);
    }
}
