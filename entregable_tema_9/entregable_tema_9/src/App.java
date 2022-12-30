public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Cliente myCliente = new Cliente();
        Trabajador myTrabajador = new Trabajador();
        System.out.println("nombre:" + (myCliente.nombre = "sebas"));
        System.out.println("edad:" + (myCliente.edad = 25));
        System.out.println("telefono:" + (myCliente.telefono = "3157613451"));
        System.out.println("credito: " + (myCliente.credito = 1500000 ));
        System.out.println("nombre:" + (myTrabajador.nombre = "victoria"));
        System.out.println("edad:" + (myTrabajador.edad = 32));
        System.out.println("telefono:" + (myTrabajador.telefono = "3002994512"));
        System.out.println("salario: " + (myTrabajador.salario = 3000000));
    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}