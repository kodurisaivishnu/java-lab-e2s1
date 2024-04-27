
class p
{
    boolean flag=false;
}




class pro extends Thread
{
    p ref;
    pro(p obj)
    {
        ref=obj;
        ref.flag=true;
    }
    public void run()
    {
        int i=500;
        while(i-- >0 && ref.flag )
        {
            System.out.println("Not over !");
        }
    }
}


class cus extends Thread
{
    p ref;
    cus(p obj)
    {
        ref=obj;
    }

   public void run()
   {
        if(ref.flag)
        {
            try{ Thread.sleep(1000); }catch(Exception e){}   //this line is to stop its exicution time

            System.out.println("over!");
            ref.flag=false;
        }
   }
}



public class DataStatus2practice {
    public static void main(String args[])
    {
        // System.out.println("hello");

        p p=new p();

        pro pro=new pro(p);
        cus cus=new cus(p);

        pro.start();
        cus.start();
    }
    
}
