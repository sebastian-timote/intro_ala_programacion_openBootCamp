public class App_video8_ej_abstraccion {
    public static void main(String[] args) throws Exception {
        //solo podemos acceder a las propiedades atraves de funciones llamadas setter y getters
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("coche");
        System.out.println(vehiculo.getTipo() );


    }
}
abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;
    //String tipo;
    abstract public void setSonido(String sonido);
    abstract public String getSonido();
    public void setTipo(String valor){//convencion de java set + nombre variable para los setters
        this.tipo = valor; 
    }

    public String  getTipo(){
        return this.tipo;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
}