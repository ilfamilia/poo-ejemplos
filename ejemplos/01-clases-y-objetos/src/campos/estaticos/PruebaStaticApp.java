package campos.estaticos;

public class PruebaStaticApp {
    public static void main(String[] args) {
        // Aunque se puede acceder a un miembro static desde un objeto (prueba1.i),
        // lo recomendado es acceder desde la clase (PruebaStatic.i) para evitar confusión.
        PruebaStatic prueba1 = new PruebaStatic();
        PruebaStatic prueba2 = new PruebaStatic();

        System.out.println("Valor inicial de i en ambos objetos");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();

        // Cambiar el valor usando una instancia (posible, pero no recomendado)
        prueba1.i = 24;

        System.out.println("Valor de i después de modificar en prueba1");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();

        // Forma recomendada: modificar usando la clase
        PruebaStatic.i = 30;

        System.out.println("Valor de i modificado a través de la clase");
        System.out.println("Valor de i en prueba1: " + prueba1.i);
        System.out.println("Valor de i en prueba2: " + prueba2.i);
        System.out.println();
    }
}
