package metodos.estaticos;

public class IncrementadorApp {
    public static void main(String[] args) {

        // Ejemplo de llamada al metodo estático a traves de un objeto
        Incrementador x = new Incrementador();
        x.incrementar();

        System.out.println("Incrementando a traves del objeto");
        System.out.println("Valor de i: " + PruebaStatic.i);
        System.out.println();

        // Ejemplo de llamada al metodo estático a traves del nombre de clase
        Incrementador.incrementar();

        System.out.println("Incrementando a traves de la clase");
        System.out.println("Valor de i: " + PruebaStatic.i);
        System.out.println();
    }
}
