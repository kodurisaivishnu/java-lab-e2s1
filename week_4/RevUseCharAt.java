import java.util.Scanner;

public class RevUseCharAt {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.next();
        System.out.print("Revrse: ");
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
