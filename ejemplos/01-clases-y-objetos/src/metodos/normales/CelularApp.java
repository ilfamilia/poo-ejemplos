package metodos.normales;

public class CelularApp {
    public static void main(String[] args) {

        Celular myCel = new Celular();
        myCel.carga = 25;

        System.out.println("Carga del cel antes de cargar: " + myCel.carga);

        // Ejemplo de como llamar al metodo cargar
        myCel.cargar();

        System.out.println("Carga del cel después de cargar: " + myCel.carga);
    }
}
