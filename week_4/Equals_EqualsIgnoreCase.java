public class Equals_EqualsIgnoreCase {
    public static void main(String args[])  
    {
        String s1=new String("ABC");
        String s2=new String("abc");
        String s3=new String("ABC");
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //it just compares the strings not the addrss
        System.out.println(s1.equalsIgnoreCase(s2));

        /*  Note:
        *           if we take runtime input of strings it it is stored as objects
        *           so " == " will comapre address will no more return true even though
        *           the two strings are same.
         */
    }
}
