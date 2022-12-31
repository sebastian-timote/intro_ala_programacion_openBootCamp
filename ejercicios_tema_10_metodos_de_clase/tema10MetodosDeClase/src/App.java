public class App {
    public static void main(String[] args) throws Exception {
        Coche myCoche = new Coche();
        Moto myMoto = new Moto();
        ejecutaAcelerar(myMoto);
        ejecutaAcelerar(myCoche);



    }
    //el parametro que le pase tiene q implementar la interface Vehiculo
    //es llamada graper un funcion que se ejecuta si se le pasa un objeto que satisfaga la interface Vehiculo
    public static void ejecutaAcelerar(Vehiculo vehiculo) {
        vehiculo.acelerar(15);
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