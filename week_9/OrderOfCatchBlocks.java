import java.util.Scanner;
import java.io.*;        // thiis is for checked exceptions
public class OrderOfCatchBlocks {
    /*
        @@@@ checked Exceptions   {this must be used try and catch blockk at any cost}
        - ClassNotFoundException
        - IOException
        - InterrruptedException
        - NumberFormatException
        - RuntimeException
        @@@@ UncheckedExceptions (also called RuntimeExceptions) {they can be handled or not by try and catch not a problem :)}
        - ArthematicException
        - IndexOutOfBoundException can be array or string
        - NullPointerException

    
    */ 

    public static void main(String args[])
    {
        try
        {
            // int c=2/0;   //ArthematicException
            int arr[]={1};
            arr[2]=12345;        //ArrayIndexOutOfBoundsException
        }
        catch(ArithmeticException e)      //contineously wrong typing spell of " Arithmetic " check once
        {
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e)   //check spell of  "Bounds " s is not typing
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);  //super class exception handle all exceptions
        }

        // checked exception must use try and catch blocks, i use IOException first import io class
        try
        {
            FileInputStream fi=new FileInputStream("my.txt"); //this must be in try and catch else it may cause error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try {

            Thread.sleep(1000);       //error: unreported exception " InterruptedException " ; must be caught or declared to be thrown
        }
        catch (Exception e) {
            System.out.println(e);  
        }
    }
}
