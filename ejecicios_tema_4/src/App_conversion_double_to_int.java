public class App_conversion_double_to_int {
    public static void main(String[] args) throws Exception {
        double euros = 15.900;
        int eurosInt = (int)euros;//conversion de doble a entero
        imprimeEuros(eurosInt);
    }
    public static void imprimeEuros(int valor){
        System.out.println(valor);

    }
}