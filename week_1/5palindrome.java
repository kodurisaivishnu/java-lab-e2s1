import java.util.Scanner;
import java.lang.*;
public class palindrome {
    static int checkPalindrome(int n)
    {
        int num=n;
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            n/=10;
            rev=rev*10+r;
        }
        if(rev==num)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        if(checkPalindrome(n)==1)
        {
            System.out.println(n+" Is a palindrme");
        }
        else{
            System.out.println(n+" Is not a palindrme");
        }
    }
}
