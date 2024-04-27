// for refference
class obj
{
    int val;
    obj(int val)
    {
        this.val=val;
    }
}
public class CallByRefference {
    static void modifyVal(int val)
    {
        val++;
    }
    static void modifyobj(obj obj)
    {
        obj.val++;
    }
    public static void main(String args[])
    {
        // call by refference
        
        obj obj=new obj(0);
        System.out.println("Before modified object: "+obj.val);
        modifyobj(obj);
        System.out.println("After modified object: "+obj.val);

        // call by value

        int val=2;
        System.out.println("Before modified value: "+val);
        modifyVal(val);
        System.out.println("After modified value: "+val);



        // int a=10;
        // int b=20;
        // System.out.println(a+"   "+b);
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println(a+"    "+b);

    }
}
