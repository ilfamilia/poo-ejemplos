package acceso_publico.paquete1;

// Esta clase, junto con ConciertoApp, demuestran que se puede acceder a una clase
// o sus miembros desde cualquier otro paquete siempre que estos sean públicos
public class Cantante {

    // Se puede acceder desde cualquier parte
    public Cantante() {
        System.out.println("Preparar cantante");
    }

    // Acceso de paquete. Solo se podrá acceder dentro de este paquete
    void cantar() {
        System.out.println("Cantando canciones");
    }
}
