package inclusion.estatico;

// Este ejemplo demuestra que los metodos estáticos no son polimórficos
public class FamiliaApp {
    public static void main(String[] args) {
        Padre p = new Hijo(); //Upcast
        System.out.println(p.obtenerEstatico()); // Se ejecuta la version del padre
        System.out.println(p.obtenerDinamico()); // Se aplica polimorfismo
    }
}
