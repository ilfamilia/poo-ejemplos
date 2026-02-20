package inclusion.estatico;

class Padre {

    // Los metodos estáticos no son polimórficos
    public static String obtenerEstatico() {
        return "Padre obtenerEstatico()";
    }

    public String obtenerDinamico() {
        return "Padre obtenerDinamico()";
    }
}
