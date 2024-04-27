public class WrapperClass { 
    public static void main(String args[])
    {
        // primitive to-> object ----------->autoboxing
        // implicit
        int i=2;
        Integer j=i;
        // System.out.println(j);

        // object to primitive convertion------------>unboxing
        Integer a=3;
        // int b=a.intValue();
        int b=a.intValue();
        System.out.println(a);
    }
}
