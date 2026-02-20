package inclusion.conpolimorfismo;

// Se crea un metodo tipo estático que recibe un objeto de tipo Instrumento
// como parámetro. Lo que significa que también podemos pasar como parámetro
// cualquier otro objeto que herede de Instrumento
public class MusicaApp {

    public static void sonar(Instrumento i) {
        i.tocar("DO");
    }
    public static void main(String[] args) {
        Cuerda guitarra = new Cuerda();
        Viento flauta = new Viento();
        Percusion xilofono = new Percusion();
        sonar(guitarra); // Upcasting
        sonar(flauta);
        sonar(xilofono);
    }
}
