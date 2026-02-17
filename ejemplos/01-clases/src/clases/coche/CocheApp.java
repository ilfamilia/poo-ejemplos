package clases.coche;

public class CocheApp {
    public static void main(String[] args) {
        Coche c = new Coche();
        c.color = "azul";
        c.marca = "BMW";
        c.velocidad = 250;

        System.out.println("Datos de coche antes de acelerar: ");
        System.out.println("color: " + c.color);
        System.out.println("color: " + c.marca);
        System.out.println("color: " + c.velocidad);
        System.out.println();

        c.acelerar();

        System.out.println("Datos de coche después de acelerar: ");
        System.out.println("color: " + c.color);
        System.out.println("color: " + c.marca);
        System.out.println("color: " + c.velocidad);
        System.out.println();
    }
}
