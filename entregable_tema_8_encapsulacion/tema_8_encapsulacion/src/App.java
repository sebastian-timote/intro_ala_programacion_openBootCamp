public class App {
    public static void main(String[] args) throws Exception {
        Persona myPerson = new Persona();
        myPerson.setEdad(18);
        myPerson.setNombre("mariajose");
        myPerson.setTelefono("coming soon");
        System.out.println(myPerson.getEdad());
        System.out.println(myPerson.getNombre());
        System.out.println(myPerson.getTelefono());
        myPerson.mostrar("dfdf");


    }
}
