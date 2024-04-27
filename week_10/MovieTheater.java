class Entrance
{
    synchronized public void enter(int y)
    {
        System.out.println("Showed "+y);
        System.out.println("Entered "+y);
    }
}


class Person extends Thread
{
    int i;
    Entrance e;

    Person(int i,Entrance e)
    {
        this.i=i;
        this.e=e;
    }

    void buyTct()
    {
        System.out.println("person "+i +" Bought tct");
    }

    public void run()
    {
        buyTct();
        e.enter(i);
    }
}


public class MovieTheater 
{
    public static void main(String[] args) 
    {
        Person p[]=new Person[6];
        Entrance e=new Entrance();

        for(int i=1;i<=5;i++)
        {
            p[i]=new Person(i, e);
        }

        for(int i=1;i<=5;i++)
        {
            p[i].start();
        }

    }    
}
