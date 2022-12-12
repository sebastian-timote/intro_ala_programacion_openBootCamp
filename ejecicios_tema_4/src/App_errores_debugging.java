public class App_errores_debugging {
    public static void main(String[] args) throws Exception {
        
    }
    public static void funcion1() {
        funcion2();
    }
    public static void funcion2() {
        funcion3();
    }
    public static void funcion3() {
        funcion4();
    }
    public static void funcion4() {
        System.out.println("vaya viaje el que hemos dado");
    }
}

