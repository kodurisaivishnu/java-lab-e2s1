class product
{
    boolean flag=false;
}
class producer extends Thread
{
    product pref;
    

    producer(product obj)
    {
        pref=obj;
        pref.flag=true;
    }
    public void run()
    {
        int i=500;
        while(i-- >0)
        {
            System.out.println("NOT OVER");
        }
        
    }
}
class consumer extends Thread
{
    product pref;
    consumer(product obj)
    {
        pref=obj;
    }
    public void run()
    {
        while(pref.flag)
        {
            try{ Thread.sleep(1000); }catch(Exception e){}   // this line is to stop the execution time
            System.out.println("Over");
            pref.flag=false;
            // System.exit(0);
        }
    }
}

public class DataStatus2
{
    public static void main(String args[])
    {
        product p=new product();

        producer pro=new producer(p);
        consumer c=new consumer(p);

        pro.start();
        c.start();
    }
}