class Employee
{
    private String Fname;
    private String Lname;
    Employee(String Fname,String Lname)
    {
        this.Fname=Fname;
        this.Lname=Lname;
    }
    Employee(String Fname)
    {
        this.Fname=this.Lname=Fname;
    }
    String getFirstName()
    {
        return Fname;
    }
    String getLastName()
    {
        return Lname;
    }

}

class ContractEmployee extends Employee
{
    String department;
    String designation;
    double salary;
    ContractEmployee(String fname,String lname,String dept,String desig,double salary)
    {
        super(fname,lname);
        department=dept;
        designation=desig;
        this.salary=salary;
        
    }
    String getDept()
    {
        return department;
    }
    String getDesig()
    {
        return designation;
    }
    void setDept(String department)
    {
        this.department=department;
    }
    void setDesig(String designation)
    {
        this.designation=designation;
    }
    double getSalary()
    {
        return this.salary;
    }
    void  displayFullName()
    {
        System.out.println(this.getFirstName()+this.getLastName());
    }
    void getDetials()
    {
        System.out.println("Employee Details:");
        displayFullName();
        System.out.println("Department: " + getDept());
        System.out.println("Designation: " + getDesig());
        System.out.println("Salary: $" + getSalary());
    }
}

class RegularEmployee extends Employee
{
    String department;
    String designation;
    double salary;
    RegularEmployee(String fname,String lname,String dept,String desig,double salary)
    {
        super(fname,lname);
        department=dept;
        designation=desig;
        this.salary=salary;
    }
    String getDept()
    {
        return department;
    }
    String getDesig()
    {
        return designation;
    }
    void setDept(String department)
    {
        this.department=department;
    }
    void setDesig(String designation)
    {
        this.designation=designation;
    }
    double getSalary()
    {
        return this.salary;
    }
    void  displayFullName()
    {
        System.out.println(this.getFirstName()+this.getLastName());
    }
    void getDetials()
    {
        System.out.println("Employee Details:");
        displayFullName();
        System.out.println("Department: " + getDept());
        System.out.println("Designation: " + getDesig());
        System.out.println("Salary: $" + getSalary());
    }
}

public class Hirarchial_Inheritance {
    public static void main(String args[])
    {
        // contarct employee

        ContractEmployee sk=new ContractEmployee("Purushotham"," Sai Kiran","ML","HR",5000000);
        sk.setDept("CSE");
        sk.displayFullName();
        sk.getDetials();

        //regular employee

        RegularEmployee ssvp=new RegularEmployee("\nshiva"," Shankar","IT","Project Diretor",1200000);
        ssvp.setDesig("CEO");
        ssvp.getDetials();
    }
}
