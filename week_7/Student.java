/*
Interface StudentFee with method getAmount(),getFirstName(),getLastName(),getAddress(), getContact()
Calculate the amount paid by the Hostler and NonHostler
student by implementing interface Student Fee
*/
interface StudentFee
{
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

class Hostler implements StudentFee
{
    String FirstName;
    String LastName;
    String Address;
    String Contact;
    private double HostelFee;

    Hostler(String FirstName,String LastName,String Address,String Contact,double HostelFee)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.Contact=Contact;
        this.HostelFee=HostelFee;
    }
    public double getAmount()
    {
        return HostelFee*12;
    }
    public String getFirstName()
    {
        return "First name: "+FirstName;
    }
    public String getLastName()
    {
        return "Lastname: "+LastName;
    }
    public String getAddress()
    {
        return "Address: "+Address;
    }
    public String getContact()
    {
        return "Contact: "+Contact;
    }
    
}


class Non_Hostler implements StudentFee
{
    String FirstName;
    String LastName;
    String Address;
    String Contact;
    private double TuitionFee;

    Non_Hostler(String FirstName,String LastName,String Address,String Contact,double TuitionFee)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.Contact=Contact;
        this.TuitionFee=TuitionFee;
    }
    public double getAmount()
    {
        return TuitionFee*12;
    }
    public String getFirstName()
    {
        return  "First name: "+FirstName;
    }
    public String getLastName()
    {
        return "LastName: "+LastName;
    }
    public String getAddress()
    {
        return "Address: "+Address;
    }
    public String getContact()
    {
        return "Contact "+Contact;
    }
}

public class Student {
    public static void main(String args[])
    {
        StudentFee hosteler=new Hostler("KOduri", "Sai Vishnu", "JUlapally", "8639814270", 1200);
        System.out.println(hosteler.getLastName());
        System.out.println(hosteler.getAmount());

        StudentFee dayScholor=new Non_Hostler("Merugu", "VidyaDeep", "julapalyy", "23456789", 1111);
        System.out.println(dayScholor.getLastName());
        System.out.println(dayScholor.getAmount());
    }
    
}
