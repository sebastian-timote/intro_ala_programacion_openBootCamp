public class App_constructor {
    public static void main(String[] args) throws Exception {
        //forma1
        /*
        Coche coche = new Coche();
        System.out.printf("Puertas : %d\n", coche.numeroDePuertas);
        System.out.println(coche.velocidadActual);
        System.out.println(coche.velocidadMaxima);
         */
        
        //forma2 con parametros en el constructor
        Coche coche = new Coche(2, 90);
        System.out.printf("Puertas : %d\n", coche.numeroDePuertas);
        System.out.println(coche.velocidadActual);
        System.out.println(coche.velocidadMaxima);

    }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;
    //contructor
    //forma1
    /*
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("entre en el constructor");

    } */
    public Coche(int puertas, int velocidad){
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("entre en el constructor");

    }
    

    public void acelerar(){
        velocidadActual += 15;
    }
    public void desacelerar(){

    }

}