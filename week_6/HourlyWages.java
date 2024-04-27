// class Employee     //if hiracchial_inheretance class file avilabe no need employee class
// {
//     private String Fname;
//     private String Lname;
//     Employee(String Fname,String Lname)
//     {
//         this.Fname=Fname;
//         this.Lname=Lname;
//     }
//     Employee(String Fname)
//     {
//         this.Fname=this.Lname=Fname;
//     }
//     String getFirstName()
//     {
//         return Fname;
//     }
//     String getLastName()
//     {
//         return Lname;
//     }
// }

class ContractEmployee extends Employee
{
    String department;
    String designation="contarctEmployee";
    double salary;
    ContractEmployee(String fname,String lname,String dept,double salary)
    {
        super(fname,lname);
        department=dept;
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

class HourlyEmployee extends ContractEmployee
{
    int hour;
    double wages;
    public HourlyEmployee(String firstName, String lastName,String dept,double sal) 
    {
        super(firstName, lastName,dept,sal);
    }

    @Override
    String getDesig()
    {
        return "Hourly Worker";
    }
    void setNumberOfHours(int h)
    {
        this.hour=h;
    }
    void setWages(double wages)
    {
        this.wages=this.salary=wages;
    }
    int getNumberOfHours()
    {
       return this.hour;
    }
    double getWages()
    {
        return this.wages;
    }
    double getTotalWagesOfMonth()
    {
        return hour*wages*4;  //per month  //wages per hour  //hour=no. of hours  //4 weeks in month
    }
}


class WeeklyEmployee extends ContractEmployee
{
    int numberOfWeeks;
    double WagesPerWeek;

    WeeklyEmployee(String Fname,String Lname,String department,double sal)
    {
       
        super(Fname,Lname,department,sal);
    }
    @Override
    String getDesig()
    {
        return "Weekly Worker";
    }

    void setNumerOfWeeks(int week)
    {
        this.numberOfWeeks=week;
    }
    void setWagesPerWeek(double  money)
    {
        this.WagesPerWeek=money;
    }
    double calculateWages()
    {
        return numberOfWeeks*WagesPerWeek;
    }
}

class HourlyWages {
    public static void main(String args[])
    {
        HourlyEmployee he1=new HourlyEmployee("koduri", " Sai Vishnu ", "Revenue", 0);
        he1.getDetials();
        he1.setNumberOfHours(1);
        he1.setWages(200);
        System.out.println("Designation of employee :"+he1.getDesig());
        System.out.println("Total Number of Wages for 4 weeks(1 month): $"+he1.getTotalWagesOfMonth());

        System.out.println("\n");


        WeeklyEmployee we1=new WeeklyEmployee("Mr.", "jonny", "muncipal", 0);
        we1.setNumerOfWeeks(3);
        we1.setWagesPerWeek(800);
        we1.getDetials();
        System.out.println("Designation of employee :"+we1.getDesig());
        System.out.println("Total Number of Wages for 1 month: $"+we1.calculateWages());

    }
}
