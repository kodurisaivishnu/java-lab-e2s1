import java.util.Scanner;
import java.util.Vector;

public class vowels {
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        String str=s.toLowerCase();
        Vector<Character> vowels=new Vector<>();
        Vector<Character> consonants=new Vector<>();

        int vc=0;
        int cc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vc++;
                if(!vowels.contains(s.charAt(i)))
                    vowels.add(s.charAt(i));
            }
            else
            {
                cc++;
                if(!consonants.contains(s.charAt(i)))
                    consonants.add(s.charAt(i));
            }
        }
        System.out.println("Volwels in string are: "+vowels);
        System.out.println("The number of vowels are: "+vc);
         System.out.println("Consonants in string are: "+consonants);
        System.out.println("The number of consonants are: "+cc);
    }
}
