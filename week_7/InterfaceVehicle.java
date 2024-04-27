interface Vehicle
{
    String getColor();
    double getNumber();
    String  getConsumption();
    void display();
}

class TwoWheeler implements Vehicle
{
    String name;
    int number;
    String color;
    double FuelConsumed;
    TwoWheeler(String name,int number,String color,double FuelConsumed) 
    {
        this.name=name;
        this.number=number;
        this.color=color;
        this.FuelConsumed=FuelConsumed;
    }
    public String getColor() {return color;}
    public double getNumber(){return number;}
    public String  getConsumption(){return "\nFuel consumed by two wheeler per lit: "+FuelConsumed;}

    public void display()
    {
        System.out.println("\ncolor: "+color+"\nnumber: "+number+"\nConsumption: "+getConsumption());
    }
}

class FourWheeler implements Vehicle
{
    String name;
    int number;
    String color;
    double FuelConsumed;
    FourWheeler(String name,int number,String color,double FuelConsumed)
    {
        this.name=name;
        this.number=number;
        this.color=color;
        this.FuelConsumed=FuelConsumed;
    }

    public String getColor() {return color;}
    public double getNumber(){return number; }
    public String  getConsumption(){return "\nFuel consumed by Four wheeler per lit: "+FuelConsumed;}

    public void display()
    {
        System.out.println("\ncolor: "+color+"\nnumber: "+number+"\nConsumption: "+getConsumption());
    }
}

public class InterfaceVehicle
{
    public static void main(String args[])
    {
        Vehicle bike=new TwoWheeler("Splender",1,"Red",12);
        System.out.println(bike.getClass());
        bike.display();
        Vehicle ford=new FourWheeler("Swift", 2,"Red", 1);
        System.out.println(ford.getClass());
        ford.display();
    }
}
