public class App {
    //ejemplo recursividad
    //es una funcion que se autoinvoca o se invoca asi misma

    public static void main(String[] args) throws Exception {
       suma(10, 20); 
    }
    public static void suma(int a, int b) {
        var temp = a + b ;
        System.out.println("A vale " + a + "B vale " + b + "temp vale " + temp);
        if (b >= 90) {//funcion que saca de la recursividad
            return;
        }
        suma(a, temp);
    }
    
}

interface Vehiculo {
    void acelerar(int cuantaVelocidad);
    void frenar(int cuantaVelocidad);
    
}

class Coche implements Vehiculo{
    int velocidad = 0;
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