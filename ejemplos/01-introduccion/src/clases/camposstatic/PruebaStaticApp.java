package clases.camposstatic;

public class PruebaStaticApp {
    public static void main(String[] args) {
        // A pesar de que se crean dos objetos tipo PruebaStatic ambos objetos
        // compartirán el mismo campo estático i
        PruebaStatic prueba1 = new PruebaStatic();
        PruebaStatic prueba2 = new PruebaStatic();

        System.out.println("Valor inicial de i en ambos objetos");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();

        // Si se modifica el valor de i en prueba1 también se modificará en prueba2
        prueba1.i = 24;

        System.out.println("Valor de i después de modificar en prueba1");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();

        // Se puede acceder y modificar el campo i incluso sin crear un objeto
        PruebaStatic.i = 30;

        System.out.println("Valor de i modificado a través de la clase");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();
    }
}
