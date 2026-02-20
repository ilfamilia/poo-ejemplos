package inclusion.extensibilidad;

public class MusicaApp {

    // No se preocupa por el tipo específico, asi que sise agregan
    // nuevos instrumentos, seguirá trabajando sin complicaciones
    public static void sonar(Instrumento i) {
        i.tocar("DO");
    }

    public static void sonarTodo(Instrumento[] e) {
        for (Instrumento i : e) {
            sonar(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting durante la adición al array
        Instrumento[] orquesta = {
                new Viento(),
                new Percusion(),
                new Cuerda(),
                new VientoMetal(),
                new VientoMadera()
        };

        sonarTodo(orquesta);
    }
}
