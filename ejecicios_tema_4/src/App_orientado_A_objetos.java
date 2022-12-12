public class App_orientado_A_objetos {
    public static void main(String[] args) throws Exception {
        Coche coche = new Coche();
        System.out.println(coche.velocidadActual);
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        Coche coche2 = new Coche();
        System.out.println(coche2.velocidadActual);

    }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;
    public void acelerar(){
        velocidadActual += 15;
    }
    public void desacelerar(){

    }

}