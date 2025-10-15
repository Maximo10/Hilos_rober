import java.util.ArrayList;


public class Cajero extends Thread {
    // Campos: nombre del cajero y la lista de clientes que atenderá
    private String nombreCajero;
    private ArrayList<Usuario> clientes;

    // Constructor: recibe el nombre y la lista de clientes y los guarda en los campos
    public Cajero(String nombreCajero, ArrayList<Usuario> clientes) {
        this.nombreCajero = nombreCajero;
        this.clientes = clientes;
    }

    @Override
    public void run() {
        System.out.println(nombreCajero + " empieza a atender...");

        // Recorremos cada cliente en la lista
        for (Usuario cliente : clientes) {
            System.out.println(nombreCajero + " atiende a " + cliente.getNombre());
            try {
                // Simula que atender a un cliente tarda 3 segundos
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // Si el hilo se interrumpe mientras duerme, cae aquí
                e.printStackTrace();
            }
            System.out.println(nombreCajero + " terminó con " + cliente.getNombre());
        }

        System.out.println(nombreCajero + " ha terminado con todos sus clientes.\n");
    }
}
