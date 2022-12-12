public class App_bucle_switch {
    private static final String NO_ES_NINGUNA_ESTACION = "no es ninguna estacion escribelo sin mayusculas";

    public static void main(String[] args) throws Exception {
        var estacion = "otgoño";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                
                break;
            case "invierno":
                System.out.println("es invierno");
            
            break;
            case "primavera":
                System.out.println("es primavera");
                
            break;
            case "otoño":
                System.out.println("es otoño");
            
                break;
            default:
                System.out.println(NO_ES_NINGUNA_ESTACION);
        }
        
        
    }
}
