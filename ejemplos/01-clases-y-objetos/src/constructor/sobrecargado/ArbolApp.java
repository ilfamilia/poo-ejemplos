package constructor.sobrecargado;

public class ArbolApp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Arbol a = new Arbol(i);
        }

        // Constructor sobrecargado
        new Arbol();
    }
}
