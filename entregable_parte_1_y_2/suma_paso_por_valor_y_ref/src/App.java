public class App {
    public static void main(String[] args) throws Exception {
        //PARTE 1
        int resultado = suma(10, 20, 30);//PASO POR VALOR
        System.out.println("resultado es ");
        System.out.println(resultado);

        //PARTE 2 
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();//PASO POR REF
        miCoche.incrementarPuertas();

        System.out.println("NUMEROS DE PUERTAS");
        System.out.println(miCoche.numPuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
