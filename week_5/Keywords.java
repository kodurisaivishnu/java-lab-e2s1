// this class 

class This{
    int val;
    This(int val)
    {
        this.val=val;
    }
    void display()
    {
        System.out.println("This class value: "+this.val);
    }
}

// for super 
class A
{
    String name;
    int l;
    A(int l)
    {
        this.l=l;
    }
    double GetLength()
    {
        return l;
    }
}
class B extends A
{
    int b;
    B(int l,int b)
    {
        super(l);
        this.b=b;
    }
    double GetArea()
    {
        return l*b;
    }
}
class C extends B
{
    int h;
    C(int l,int b,int h)
    {
        super(l,b);
        this.h=h;
    }
    double GetVolume()
    {
        return l*b*h;
    }
}


public class Keywords {
    // static variable

    static int i=0;
    // static block executes before main
    static
    {
        System.out.println("Hello this is static");
    }

    public static void main(String args[])
                          
    {  
        //this,super,sattic--method,variable
        
        //1.usage of this

        // This val=new This(1);
        // val.display();

        // 2.usage of super-->used to reffer immidiate parent
        C c=new C(1,1,1);
        System.out.println(c.GetVolume());
        B r=new C(2,2,0);
        System.out.println(r.GetArea());


        // 3. static (1.method,2.value)

        Keywords static_test1_obj=new Keywords();
        Keywords static_test2_obj=new Keywords();
        System.out.println("i values before modify: ");
        System.out.println(static_test1_obj.i);
        System.out.println(static_test2_obj.i);
        static_test1_obj.i++;
        // modify reflect all objects
        System.out.println("i modified: ");
        System.out.println(static_test1_obj.i);
        System.out.println(static_test2_obj.i);

        // static method dosen't requiewd object
        // static block
    
    }
}
