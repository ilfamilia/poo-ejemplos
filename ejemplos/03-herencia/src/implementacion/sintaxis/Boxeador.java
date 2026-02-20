package implementacion.sintaxis;

// Este ejemplo muestra cómo implementar herencia en Java.
// Esta clase heredará todos los miembros public y protected de la clase base,
// y también los miembros con acceso tipo paquete si está en el mismo paquete.
public class Boxeador extends Atleta {

    // Modificando un metodo de la clase base
    @Override
    public void saltar() {
        System.out.println("Saltando de lado a lado");
        super.saltar(); // Llama a la versión de la clase base
    }

    // Podemos extender la interfaz agregando nuestros propios metodos
    public void pelear() {
        System.out.println("Peleando");
    }
}
