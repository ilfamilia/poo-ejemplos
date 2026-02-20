package implementacion.inicializacion;

// Cuando se crea un objeto de tipo Pintura de forma
// implícita se creará un sub objeto de tipo Arte
class Pintura extends Arte {
    Pintura(){
        System.out.println("Constructor de pintura");
    }
}
