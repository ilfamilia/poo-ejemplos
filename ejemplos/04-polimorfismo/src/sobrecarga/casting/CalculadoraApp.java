package sobrecarga.casting;

// Este ejemplo demuestra que aunque no existe una sobrecarga del metodo sumar
// que reciba un int y un double, Java convierte automáticamente el int a double
// para poder utilizar el metodo sumar(double, double).
public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        int a = 2, b = 3;
        double c = 2.5, d = 3.5;

        System.out.println("a + b: " + cal.sumar(a, b));
        System.out.println("c + d: " + cal.sumar(c, d));
        System.out.println("a + c: " + cal.sumar(a, c));
        System.out.println("d + b: " + cal.sumar(d, b));
    }
}
