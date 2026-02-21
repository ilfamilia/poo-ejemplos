package acceso_protegido.paquete1;

// Esta clase muestra que las clases hijas pueden acceder a los miembros
// de tipo protected de la clase padre
public class Perro extends Animal {
    public Perro() {
        System.out.println("Constructor del perro");
    }

    // Como esta clase hereda de Animal puede usar su metodo morder
    public void mordisquear() {
        System.out.print("Perro: ");
        morder();
    }
}
