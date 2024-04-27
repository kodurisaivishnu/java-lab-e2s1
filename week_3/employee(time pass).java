class Emp {
    int emp_id;
    String Emp_name;
    int Emp_age;
    char Emp_gender;
    String Emp_designation;
    float Emp_salary;
    String Emp_Address;
    Emp(int a)
    {
        System.out.println(2+" "+a);
    }
    Emp(double a)
    {
        System.out.println(1+" "+a);
    }
    Emp(int emp_id,String Emp_name,int Emp_age,char Emp_gender,String Emp_designation,float Emp_salary,String Emp_Address)
    {
        this.emp_id=emp_id;
        this.Emp_name=Emp_name;
        this.Emp_age=Emp_age;
        this.Emp_gender=Emp_gender;
        this.Emp_designation=Emp_designation;
        this.Emp_salary=Emp_salary;
        this.Emp_Address=Emp_Address;
    }
    void print()
    {
        System.out.println(Emp_name);
    }
};
public class employee
{
    // public static void main(String args[])
    // {
    //     // System.out.println("hi");
    //     // Emp e1= new Emp(1,"sai",20,'M',"Student",0.00f,"Julapalli Julapally peddapalli");
    //     // int arr[]=new int[100];
    //     // arr[0]=e1.emp_id;
    //     Emp e1=new Emp(1);
    //     // e1.print();
    //     System.out.println(e1);    
    // }
}