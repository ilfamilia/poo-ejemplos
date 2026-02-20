package inclusion.estatico;

class Hijo extends Padre {

    // No se puede usar @verride con metodos estaticos
    public static String obtenerEstatico() {
        return "Hijo obtenerEstatico()";
    }

    @Override
    public String obtenerDinamico() {
        return "Hijo obtenerDinamico()";
    }
}
