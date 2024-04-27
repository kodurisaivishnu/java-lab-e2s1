import java.util.*;
public class IndexOf {

    //this is the required program as per the lab manual
    
    static void UseIndexof(String s,char ch)
    {
        int count=0;
        int index=s.indexOf(ch);

        while(index!=-1)
        {
            count++;
            index=s.indexOf(ch,index+1);
        }

        System.out.println(count);
        //method 2:
        
        // int c=0;
        // for(i=0;i<s.length();i++)
        //s.charAt(s.indexOf(ch))==s.charAt(i);
    }
    public static void main(String args[])
    {
        // ye hamara old logic chote bachhe --ksv
        // String s1="kodurisaivishnu";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        System.out.println("Enter charector: ");
        char ch=sc.nextLine().charAt(0);
        UseIndexof(s1,ch);






        // int c=0;

        // int count=0;
        // for(int i=0;i<s1.length();i++)
        // {
        //     if(s1.indexOf('a',c)>-1)
        //     {
        //         count++;
        //         c=s1.indexOf('a')+1;
        //     }
        //     // c=s1.indexOf('a')+1;
        //     // System.out.println(x);
        //     //charAt(indexOf(CharAt(i)));
        //     // if(s1.charAt(i)==ch)
        //     // {
        //     //     c++;
        //     // }
        // }
        // // System.out.println(ch+" occured "+ count+" times ");
        // // System.out.println(s1.indexOf('a', 8));
        // System.out.println(count);
    }
}
