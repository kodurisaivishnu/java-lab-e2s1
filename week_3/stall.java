class Book
{

}

class c
{
    int id;
    Book b;
    c(int id,Book b)
    { 
        this.id=id; 
        this.b=b;
    }

    public void buyBook()
    {
        if(b.c<=0)
        {
            System.out.println("not avilable..");
        }
        else
        {
            b.c--;
            
        }
    }
}

public class stall {
    public static void main(String[] args) {
        c c1=new c(1);
    }
    
}
