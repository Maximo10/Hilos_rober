public class Usuario extends Thread{
    private String Nombre;

    public Usuario(String Nombre){
        this.Nombre=Nombre;

    }
    public String getNombre() {
        return Nombre;
    }
}
