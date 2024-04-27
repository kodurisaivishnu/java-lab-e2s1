class Data
{ 
    boolean flag=true; 
    int val=0;

    synchronized public void set(int v)
    {
        while(flag!=true)
        {
            try{ Thread.sleep(1000); } catch(Exception e){}
        }
        val=v;
        flag=false;
        // notify();
    }

    synchronized public int get()
    {
        while(flag!=false)
        {
            try{Thread.sleep(1000); } catch(Exception e){}
        }
        int x= val;
        flag=true;
        // notify();
        return x;
    }

    // synchronized void check()
    // {
        
    // }
}
class Producer extends Thread
{
    Data dref;
    Producer(Data obj)
    {
        dref=obj;
    }
    int i=1;
    public void run()
    {
        while(true)
        {
            dref.set(i);
            System.out.println("Produced: "+i);
            i++;
        }
    }
}
class Consumer extends Thread
{
    Data dref;
    Consumer(Data obj)
    {
        dref=obj;
    }
    public void run()
    {
        while(true)
        {
            System.out.println("Consumed: "+dref.get());
        }
    }
}


public class DataProducton
{
    public static void main(String args[])
    {
        Data obj=new Data();

        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);

        p.start();
        c.start();
    }

}
