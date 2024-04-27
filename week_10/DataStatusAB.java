
public class DataStatusAB implements Runnable{

    public void run()
    {
        int i=2;
        while (i++<50) {
            System.out.println("Not over !");  
        }
    }
    public static void main(String[] args) {

        DataStatusAB p=new DataStatusAB();

        Thread t=new Thread(p);

        // t.setDaemon(true);
        t.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        
        // Thread mainThread= Thread.currentThread();
        
        
        // try{mainThread.join();}catch(Exception e){}
        
        int i=2;
        while (i++<50) {
            System.out.println("over!");
            
        }
        System.exit(0);
        
    }
}
