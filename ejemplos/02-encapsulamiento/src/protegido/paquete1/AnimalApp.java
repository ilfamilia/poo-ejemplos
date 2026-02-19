package protegido.paquete1;

public class AnimalApp {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.mordisquear();

        // Aunque AnimalApp no herede de Animal puede acceder al metodo morder,
        // ya que pertenecen al mismo paquete
        new Animal().morder();
    }
}
