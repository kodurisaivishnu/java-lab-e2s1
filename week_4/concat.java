public class concat {
    public static void main(String args[])
    {
        String s1="koduri";
        String s2=" Sai";
        s1.concat(s2);
        String mix=s1.concat(s2);
        System.out.println(s1);
        StringBuffer sb1=new StringBuffer("sai");
        StringBuffer sb2=new StringBuffer("Vishnu");
        sb1.append(sb2);
        // System.out.println(sb1);
    }
}
