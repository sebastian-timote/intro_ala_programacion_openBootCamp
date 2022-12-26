public class App {
    public static void main(String[] args) throws Exception {
        
        // Vehiculo myVehiculo = new Vehiculo();
        // myVehiculo.setSonido("BRRRrrrr");
        // System.out.println(myVehiculo.getsonido());
        
    }
}
class Vehiculo {
    int velocidadMaxima;
    public Vehiculo(){//constructor
        System.out.println("estoy en el constructor de vehiculo");
    }
}

class Motor {
    String tipoMotor;
    public Motor() { 
        System.out.println("estoy en el constructor de Motor");
    }
}

class Coche extends Vehiculo, Motor {//herencia multiple - cuando una clase hereda  o tiene dos padres
//a la fecha java ya no permite herencia multiple para evitar: - la ambiguedad del codigo - dar mas simplicidad a java - consideraron que la herencia multiple causa mas problemas que los que resolvia.
}
