package acceso_protegido.paquete2;

import acceso_protegido.paquete1.Animal;

// Esta clase demuestra que las clases hijas pueden acceder a los miembros de tipo
// protected incluso aunque se encuentren en otro paquete
public class Gato extends Animal {
    public Gato() {
        System.out.println("Constructor del gato");
    }

    // Como lo clase hereda de Animal puede acceder a su metodo morder
    public void mordisquear() {
        System.out.print("Gato: ");
        morder();
    }
}
