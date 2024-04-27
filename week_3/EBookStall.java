class Book
{
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    public Book(String bookName,String bookAuthor,int bookCount)
    {
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookCount=bookCount;
    }
    public String getBookName()
    {
        return bookName;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public int getbookCount()
    {
        return bookCount;
    }

    public void reduceBookCount()
    {
        if(bookCount>0)
        {
            bookCount--;
        }
    }
};

class Customer
{
    private int customerId;
    private String customerName;
    private String customerAddr;

    public Customer(int customerId,String customerName,String customerAddr)
    {
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerAddr=customerAddr;
    }

    public void buyBook(Book book)
    {
        System.out.println("\nCustomer Name: "+this.customerName+" \nBook name: " +book.getBookName());
        if(book.getbookCount()>0)
        {
            book.reduceBookCount();
            System.out.println("\nBook Sucesfully Purchaced !\n");
        }
        else
        {
            System.out.println("\nCurrently this book is out of stock !\n");
        }
    }
}
public class EBookStall
{
    public static void main(String args[])
    {
        Book book1=new Book("Introduction to Rgukt","koduri sai vishnu",3);
        Book book2 =new Book("Introduction to Engeneering","ksv",1);

        Customer c1=new Customer(1, "Koduri sai vishnu", "julapally");

        c1.buyBook(book2);
        delay();
        c1.buyBook(book1);
        delay();
        c1.buyBook(book2);
        delay();
        c1.buyBook(book1);
        delay();
    }
    public static void delay()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println();
        }
    }
}