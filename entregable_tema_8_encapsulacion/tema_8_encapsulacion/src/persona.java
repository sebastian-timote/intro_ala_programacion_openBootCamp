class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    /**getter de las variables privadas para poder accederlas */
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    /*setters */
    public void setEdad(int anos){
        this.edad = anos;
    }
    public void setNombre(String name){
        this.nombre = name;
    }
    public void setTelefono(String cel){
        this.telefono = cel;
    }
    public void mostrar(String dato){
        String data;
        if (dato == "nombre") {
            data = this.nombre;
        }else if(dato == "telefono"){
            data = this.telefono;
        }else{
            data = "nada";

        }
        System.out.println(data); 
        
    }
}
