public class StringMethodComapreTo {
    public static void main(String args[])
    {
        String s1="ABC";
        String s2="abc";
        String s3="ABC";
        String s4=new String("ABC");
        System.out.println(s1.compareTo(s2));//-32
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3); //here s1 and s3 are same litterals so same address true
        System.out.println(s1==s4);

    }
}
