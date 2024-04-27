    /*
 
Create an abstract class Employee with methods 
getAmount() which displays the amount paid to employee. 
Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee 
according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.
*/

abstract class Employee
{
    abstract double getAmount();
}

class HourlyEmployee extends Employee
{
    int NumberOfHours;
    double WagesPerHour;
    HourlyEmployee(int NumberOfHours,double WagesPerHour)
    {
        this.NumberOfHours=NumberOfHours;
        this.WagesPerHour=WagesPerHour;
    }

    @Override
    double getAmount()
    {
        return NumberOfHours*WagesPerHour;
    }
}

class WeeklyEmployee extends Employee
{
    int NumberOfWeeks;
    double WagesPerWeek;

    WeeklyEmployee(int NumberOfWeeks,double WagesPerWeek)
    {
        this.NumberOfWeeks=NumberOfWeeks;
        this.WagesPerWeek=WagesPerWeek;
    }
    @Override
    double getAmount()
    {
        return NumberOfWeeks*WagesPerWeek;
    }
}

public class Emp {
    public static void main(String args[])
    {
        Employee he1=new HourlyEmployee(5, 100);
        System.out.println("Hourly Employee Amount : "+he1.getAmount());

        Employee we1=new WeeklyEmployee(4, 2000);
        System.out.println("Weekly Employee Wages "+we1.getAmount());

    }
}
