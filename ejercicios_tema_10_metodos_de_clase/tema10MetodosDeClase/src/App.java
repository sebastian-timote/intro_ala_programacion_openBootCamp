public class App {
    //ejemplo recursividad
    //es una funcion que se autoinvoca o se invoca asi misma

    public static void main(String[] args) throws Exception {
       factorial(8); 
    }
    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
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