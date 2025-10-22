import java.util.ArrayList;
public class Main {
    //necesitamos un InterruptedException para determinar las excepciones de las interupciones para controlar
    //el orden de ejecuciones
    public static void main(String[] args) throws InterruptedException {
        // Creamos listas de usuarios para cada cajero
        ArrayList<Usuario> cajaA = new ArrayList<>();
        ArrayList<Usuario> cajaB = new ArrayList<>();

        // Creamos 8 usuarios
        Usuario user1 = new Usuario("Usuario1");
        Usuario user2 = new Usuario("Usuario2");
        Usuario user3 = new Usuario("Usuario3");
        Usuario user4 = new Usuario("Usuario4");
        Usuario user5 = new Usuario("Usuario5");
        Usuario user6 = new Usuario("Usuario6");
        Usuario user7 = new Usuario("Usuario7");
        Usuario user8 = new Usuario("Usuario8");

        // Asignar usuario a cada cajero
        cajaA.add(user1);
        cajaA.add(user2);
        cajaA.add(user3);
        cajaA.add(user4);

        cajaB.add(user5);
        cajaB.add(user6);
        cajaB.add(user7);
        cajaB.add(user8);

        // Crear los cajeros
        Cajero cajeroA = new Cajero("Cajero A", cajaA);
        Cajero cajeroB = new Cajero("Cajero B", cajaB);

        // Iniciamos los hilos
        cajeroA.start();
        cajeroB.start();

        // Esperamos que terminen
        cajeroA.join();
        cajeroB.join();

        System.out.println("Todos los cajeros han terminado de atender.");
    }
}
