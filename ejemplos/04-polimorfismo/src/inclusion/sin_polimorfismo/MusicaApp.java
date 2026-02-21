package inclusion.sin_polimorfismo;

// Este ejemplo muestra que cuando no trabajamos con tipos generales
// debemos sobrecargar el metodo sonar para cada tipo especifico
public class MusicaApp {

    public static void sonar(Cuerda i) {
        i.tocar("DO");
    }

    public static void sonar(Viento i) {
        i.tocar("DO");
    }

    public static void sonar(Percusion i) {
        i.tocar("DO");
    }

    public static void main(String[] args) {
        Cuerda guitarra = new Cuerda();
        Viento flauta = new Viento();
        Percusion xilofono = new Percusion();
        sonar(guitarra); // No upcasting
        sonar(flauta);
        sonar(xilofono);
    }
}
