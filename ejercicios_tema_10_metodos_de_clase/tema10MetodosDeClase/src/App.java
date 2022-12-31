public class App {
    //ejemplo paso por valor
    //al pasar variables por valor las variables de la clase principal se copian en los parametros 
    //de la funcion creando nuevos espacios de memoria y ocupando mas recursos es su principal desventaja
    //si tenemos una aplicacion pequeña esto no se va a notar mucho pero mientra vaya creciendo la app 
    //nos podria afectar
    public static void main(String[] args) throws Exception {
        var valA = 15;// int = 32bits, = 4bytes
        var valB = 10;// int = 32bits, = 4bytes

        suma(valA, valB);

        System.out.println(valA);
        System.out.println(valB);


    }
    public static int suma(int a , int b) {
        return a + b ;
    }
    
}

interface Vehiculo {
    void acelerar(int cuantaVelocidad);
    void frenar(int cuantaVelocidad);
    
}

class Coche implements Vehiculo{

    public void acelerar(int cuantaVelocidad){
        System.out.println("coche() - acelerar()");
    }
    public void frenar(int cuantaVelocidad){
        System.out.println("coche() - frenar()");
    }
}

class Moto implements Vehiculo{

    public void acelerar(int cuantaVelocidad){
        System.out.println("Moto() - acelerar()");
    }
    public void frenar(int cuantaVelocidad){
        System.out.println("Moto() - frenar()");
    }
}