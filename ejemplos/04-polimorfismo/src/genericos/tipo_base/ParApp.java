package genericos.tipo_base;

public class ParApp {

    public static void main(String[] args) {

        // Par de enteros
        Par<Integer> numeros = new Par<>(10, 20);

        // Par de Strings
        Par<String> palabras = new Par<>("Hola", "Mundo");

        System.out.println("Primer número: " + numeros.getPrimero());
        System.out.println("Segundo número: " + numeros.getSegundo());
        numeros.mostrarTipos();

        System.out.println();

        System.out.println("Primera palabra: " + palabras.getPrimero());
        System.out.println("Segunda palabra: " + palabras.getSegundo());
        palabras.mostrarTipos();
    }
}
