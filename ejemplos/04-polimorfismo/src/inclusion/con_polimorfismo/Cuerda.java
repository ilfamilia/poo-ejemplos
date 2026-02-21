package inclusion.con_polimorfismo;

// Los objetos de tipo Cuerda son tambien de tipo Instrumento
// ya que comparten la misma interfaz
class Cuerda extends Instrumento{
    // Se sobreescribe el metodo tocar
    @Override
    public void tocar(String nota) {
        System.out.println("Cuerda toca nota: " + nota);
    }
}
