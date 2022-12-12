public class App {
    public static void main(String[] args) throws Exception {
        Coche myCoche = new Coche();
        myCoche.velocidadMaxima = 14;/*aunque la clase coche este vacia hereda de su padre vehiculo sus funciones y propiedades */
        
        CocheElectrico myCocheE = new CocheElectrico();
        myCocheE.matricula = "EVA46F";
        System.out.println(myCocheE.compruebaMatricula("abc"));
    }
}
class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String tipoGasolina;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }
}
/*ejemplo de herencia clase hija */
// final class Coche extends Vehiculo {  
// }
class Coche extends Vehiculo {

  
}


class CocheElectrico extends Coche {

    
}
