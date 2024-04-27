/*  

Create an Interface payable with method getAmount ()

Calculate the amount to be paid to Invoice and Employee by implementing Interface.
*/


// invoice=charges+salary


interface Payable
{
    double getAmount();   //it is default public and abstract
}


class Employee implements Payable
{
    String Eid;
    double salaryPerDay;
    double Charges;

    Employee(String Eid,double salaryPerDay,double Charges)
    {
        this.Eid=Eid;
        this.salaryPerDay=salaryPerDay;
        this.Charges=Charges;
    }
    @Override
    public double getAmount()
    {
        System.out.print("Employee id: "+this.Eid+"\nInvoice: ");
        return (30*salaryPerDay)+Charges;

    }
}

public class Interface3 {
    public static void main(String args[])
    {
        Payable p1=new Employee("KSV", 1, 1);
        System.out.println(p1.getAmount());
    }
}
