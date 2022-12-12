public class App_sobrecargaConstructor {
    public static void main(String[] args) throws Exception {
        /*
        sobrecarga: son dos funciones llamadas igual pero que trae diferentes parametros
        en este caso se realiza con constructores
         */
        Coche coche = new Coche();
        System.out.printf("Puertas : %d\n", coche.numeroDePuertas);
        System.out.println(coche.velocidadActual);
        System.out.println(coche.velocidadMaxima);
        
        Coche coche2 = new Coche(2, 90);
        System.out.printf("Puertas : %d\n", coche2.numeroDePuertas);
        System.out.println(coche2.velocidadActual);
        System.out.println(coche2.velocidadMaxima);

    }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;
    //contructor
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("entre en el constructor sin nada");

    }
    //contructor2
    public Coche(int puertas, int velocidad){
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("entre en el constructor con parametros");

    }
    

    public void acelerar(){
        velocidadActual += 15;
    }
    public void desacelerar(){

    }

}