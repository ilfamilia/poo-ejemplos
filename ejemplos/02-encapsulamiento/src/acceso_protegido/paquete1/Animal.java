package acceso_protegido.paquete1;

// Ejemplo del uso de protected dentro de una clase
public class Animal {
    public Animal() {
        System.out.println("Constructor del animal");
    }

    // Este metodo solo puede ser accedido por clases hijas
    // o clases que estén en el mismo paquete
    protected void morder() {
        System.out.println("Mordiendo");
    }
}
