public class App {
    //POLIMORFISMO - CUANDO UNA CLASE HIJA IMPLEMENTA UNA FUNCION DEL PADRE PERO HACE ALGO DISTINTO
    //otro ejemplo polimorfismo podemos ver la funcion sumaNumeros que es polimorfica ya que se llama igual
    //pero se diferencia del dato que se le pase, si se lepasan datos incorrectos arrojara error
    public static void main(String[] args) throws Exception {
        
        Coche myCoche = new Coche();
        //System.out.println(myCoche.sumaNumeros(8, 1));
        //System.out.println(myCoche.sumaNumeros((float)8, (float)1));
        myCoche.sumaNumeros(2.3, 5.2);


        
    }
}
class Vehiculo {
    
    public void diHola() {
        System.out.println("HOLA!!");
    }
}
class Coche extends Vehiculo{
    public void diHola() {
       System.out.println("soy un coche!!");
    }

    public int sumaNumeros(int a, int b) {
        System.out.println("soy el sumanumeros de enteros");
        return a + b;
    }
    public Float sumaNumeros(Float a, Float b) {
        System.out.println("soy el sumanumeros de float");
        return a + b * (float)9.2;
    }
    public void sumaNumeros(Double a, Double b) {
        System.out.println("soy el sumanumeros de double");
        System.out.println("el resultado es: " + (a + b));
    }
}




