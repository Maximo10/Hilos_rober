public class Cod_Run extends Thread{
    private final String info;

    public Cod_Run(String info1){
        this.info= info1;
    }
    public void run(){
        
        System.out.println(info);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
