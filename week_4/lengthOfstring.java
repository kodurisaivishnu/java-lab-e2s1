import java.util.Scanner;

public class lengthOfstring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int l=0;
        for(char c:ch)
        {
            l++;
        }
        System.out.println("Length: "+l);
    }
}
