package constructor.sobrecargado;

class Arbol {
    int altura;

    // Se definen dos sobrecargas del constructor. Una que no acepta arguementos
    // y otra que acepta un argumento de tipo int
    Arbol() {
        System.out.println("Plantando semilla");
        altura = 0;
    }

    Arbol(int alturaInicial) {
        altura = alturaInicial;
        System.out.println("Plantando un arbol de " + altura + " pies de altura");
    }
}
