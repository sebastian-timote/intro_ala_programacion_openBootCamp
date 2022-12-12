public class App_video8_privacidad_abstraccion_encapsulacion {
    public static void main(String[] args) throws Exception {
        //solo podemos acceder a las propiedades atraves de funciones llamadas setter y getters
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("coche");
        vehiculo.setVelocidadMaxima(120);
        vehiculo.setRapido(true);
        System.out.println(vehiculo.getTipo() + " " + vehiculo.getVelocidadMaxima());
        System.out.println(vehiculo.isRapido());

    }
}
class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;
    //String tipo;
    public void setRapido(boolean rapido){
        this.rapido = rapido;
    }
    public boolean isRapido(){
        return this.rapido;
    }
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