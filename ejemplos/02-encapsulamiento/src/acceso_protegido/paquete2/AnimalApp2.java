package acceso_protegido.paquete2;

public class AnimalApp2 {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.mordisquear();

        // Esta clase no puede acceder al metodo morder porque no hereda de Animal
        // ni pertenece al mismo paquete
        //! new Animal().morder();
    }
}
