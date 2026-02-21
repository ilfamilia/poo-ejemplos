package genericos.sintaxis;

public class CajaApp {

    public static void main(String[] args) {

        // Caja que almacena Strings
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.set("Hola mundo");

        // Caja que almacena enteros
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.set(123);

        System.out.println("Texto: " + cajaTexto.get());
        System.out.println("Número: " + cajaNumero.get());
    }
}
