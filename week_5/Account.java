import java.util.*;
import java.lang.*;

class BankAccount
{
    // Account details
    private String Acct_Name;
    private String Acct_acctno;
    private double Acct_Bal;
    private String Acct_Address;
    BankAccount(String Acct_Name,String Acct_acctno,double Acct_Bal,String Acct_Address)
    {
        this.Acct_Name=Acct_Name;
        if(Acct_Bal>0)
        {
            this.Acct_acctno=Acct_acctno;
        }
        else
        {
            System.out.println("Enter new balnce >0: ");
            Scanner sc=new Scanner(System.in);
            double bal=sc.nextDouble();
            credit(bal);
            
        }
        this.Acct_Bal=Acct_Bal;
        this.Acct_Address=Acct_Address;
    }
    void credit(double bal)
    {
        System.out.println("\nAccount Holder Name: "+this.Acct_Name);
        System.out.println("Your account credited: RS: "+bal);
        Acct_Bal=Acct_Bal+bal;
        System.out.println("Total Avilable Balane: Rs "+GetBalance());
    }
    double debt(double bal)
    {
        System.out.println("\nAccount Holder Name: "+this.Acct_Name);
        Acct_Bal=Acct_Bal-bal;
        System.out.println("Your account debited: Rs: "+bal);
        return GetBalance();
    }
    Double GetBalance()
    {
        return this.Acct_Bal;
    }
    void getAccDet()
    {
        System.out.println("\nName: "+this.Acct_Name+"\nAccount balnce: "+this.Acct_Bal+"Account number: "+this.Acct_acctno+"Address: "+Acct_Address);
    }
}

public class Account {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BankAccount b1=new BankAccount("Koduri", "12345", 0, "JPL");

        int c;
        do
        {
            System.out.println("\n1.credit\t2.debt\t3.Account deatias\n");
            System.out.print("Enter option: ");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                {
                    System.out.print("Eneter balance to credit: ");
                    double bal=sc.nextDouble();
                    b1.credit(bal);
                    break;
                }
                case 2:
                {
                    System.out.print("Eneter balance to debt: ");
                    double bal=sc.nextDouble();
                    b1.debt(bal);
                    System.out.println("Total Avilable balance: "+b1.GetBalance());
                    break;
                }
                case 3:
                {
                    b1.getAccDet();
                }
                default:
                {
                    System.out.println("Bye..");
                    return;
                }
            }

        }while(c!=0);
       
    }
}
