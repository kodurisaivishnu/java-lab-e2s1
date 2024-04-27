import java.util.*;
import java.lang.*;

class calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        char c;
        int a,b;
        System.out.println("\nSelect one: + - * /");
            System.out.print("Enter choice :");
            c=sc.next().charAt(0);
            a=sc.nextInt();
            b=sc.nextInt();
            switch(c)
            {
                case '+': System.out.println(a+b); break;
                case '-': System.out.println(a-b); break;
                case '*': System.out.println(a*b); break;
                case '/': System.out.println(a/b); break;
            }
    }
}
