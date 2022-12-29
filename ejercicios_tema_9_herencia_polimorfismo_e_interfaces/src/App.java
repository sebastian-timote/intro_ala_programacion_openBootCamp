public class App {
    //INTERFACES
    //utilizamos las interfaces cuando queremos crear clases y esas clases con unas funciones ya definidas
    //los programadores se ponen deacuerdo para que las clases queden con las mismas funciones 
    //las interfaces se utilizan para unificar metodos
    //las ventajas de las interfaces es que si yo se que una clase la implementa tengo la certeza de los
    //metodos que va a tener
    public static void main(String[] args) throws Exception {
        
    }
}
interface Vehiculo {
//yo no implemento la funcion pero si le digo las funciones que debe implementar el programador
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
//no voy a heredar la interface la voya implementar
    public void Acelerar(int cuantaVelocidad){

    }
    public void Frenar(int cuantaVelocidad){

    }
}




