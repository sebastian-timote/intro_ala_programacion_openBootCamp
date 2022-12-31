public class App {
    //ejemplo paso por referencia
    //en el paso por ref creamos punteros en java su nombre es crear objeto o instaciar

    public static void main(String[] args) throws Exception {
        
        Coche myCoche = new Coche(); //creamos un puntero una ref de memoria
        cocheChanger(myCoche);
        cocheChanger(myCoche);

        System.out.println(myCoche.velocidad);


    }
    public static int cocheChanger(Coche coche) {//nos referimos a un objeto coche
        return coche.velocidad += 50; 
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