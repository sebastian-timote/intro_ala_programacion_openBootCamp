public class App {
    //POLIMORFISMO - CUANDO UNA CLASE HIJA IMPLEMENTA UNA FUNCION DEL PADRE PERO HACE ALGO DISTINTO
    //en el ejemplo vamos a implementar dos clases con el mismo nombre una en el padre y otra en el hijo
    //al momento de crear el objeto o instaciarla, si hay una  funcion en la clase hija con el mismo nombre
    //de una funcion en la clase padre la funcion de la clase hija sustituira la funcion de la clase padre
    //esto es el polimorfismo
    public static void main(String[] args) throws Exception {
        
        Coche myCoche = new Coche();
        myCoche.diHola();
        
    }
}
class Vehiculo {
    
    public void diHola() {
        System.out.println("HOLA!!");
    }
}
class Coche extends Vehiculo{
//si comentamos la funcion toma el dato de la funcion en la clase del padre
    public void diHola() {
       System.out.println("soy un coche!!");
    }
}



