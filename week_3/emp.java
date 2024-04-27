import java.util.Scanner;

class Employee
{
    int emp_id;
    String Emp_name;
    float Emp_age;
    String Emp_gender;
    String Emp_designation;
    float Emp_salary;
    String Emp_Address;
    Employee(int emp_id,String Emp_name,int Emp_age,String Emp_gender,String Emp_designation,float Emp_salary,String Emp_Address)
    {
        this.emp_id=emp_id;
        this.Emp_name=Emp_name;
        this.Emp_age=Emp_age;
        this.Emp_gender=Emp_gender;
        this.Emp_designation=Emp_designation;
        this.Emp_salary=Emp_salary;
        this.Emp_Address=Emp_Address;
    }
    void display()
    {
        System.out.println("\nName: "+Emp_name+"\nAge: "+Emp_age+"\nGender: "+Emp_gender+"\nDesignation: "+Emp_designation+"\nSalary: "+Emp_salary+"\nAddress: "+Emp_Address);
        
    }
}

public class emp {
        public static void main(String args[])
        {
            //createing array of objects..
            
            Employee emp_ids[]=new Employee[4];
            emp_ids[0]=new Employee(0, null, 0, null, null, 0, null);
            emp_ids[1]=new Employee(1, "koduri", 20, "M", "VC", 1000000.23f, "Peddapally");
            emp_ids[2]=new Employee(2, "Sai", 19, "M", "Dean", 100000.212f, "Karimnagar");
            emp_ids[3]=new Employee(3, "Vishnu", 21, "M", "HOD", 10000.23f, "Peddapally");
            int c;
            Scanner sc =new Scanner(System.in);
            do
            {
                System.out.print("\nEnter any Emp id in  (1-3): ");
                c=sc.nextInt();
                if(c<4)
                {emp_ids[c].display();}
                else
                {System.out.println("\nInvalid entry Exit");}
            }while(c!=4);
            sc.close();
        }
}
