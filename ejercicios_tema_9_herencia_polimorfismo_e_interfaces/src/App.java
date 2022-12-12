public class App {
    public static void main(String[] args) throws Exception {
        Coche myCoche = new Coche();
        myCoche.setSonido("BRRRerere");
        System.out.println(myCoche.getsonido());

        Moto myMoto = new Moto();
        myMoto.setSonido("rannnnn");
        System.out.println(myMoto.getsonido());
        //una clase abstracta no se puede instanciar directamente se debe hacer una clase que la herede
        // Vehiculo myVehiculo = new Vehiculo();
        // myVehiculo.setSonido("BRRRrrrr");
        // System.out.println(myVehiculo.getsonido());
        
    }
}
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("estoy en el constructor de vehiculo");
    }
    //las funciones abstractas no tiene cuerpo
    abstract public String getsonido();
    abstract public void setSonido(String sonido);
}
/*ejemplo de herencia clase hija */

class Coche extends Vehiculo {
//como vehiculo es abstracto tengo que implementar en Coche los metodos abstractos en Vehiculo(getSonido y setSonido) y darle una funcionalidad
// ya que si llegara a necesitar un metodo de Vehiculo y estos metodos son adstractos sin cuerpo, no sabria que hacen
// por eso en Coche debo implementarlos y darle una funcionalidad si no sale un error

public String getsonido(){
    return "Soy un super sonido " + this.sonido;// retorno el valor de la variable de la clase padre es decir Vehiculo
}
public void setSonido(String sonido){
    this.sonido = sonido;
}


  
}


class Moto extends Vehiculo {

    public String getsonido(){
        return "Soy un super sonidito de moto " + this.sonido;// retorno el valor de la variable de la clase padre es decir Vehiculo
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    
}
