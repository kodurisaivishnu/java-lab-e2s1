// class Vehicle
// {
//     private String vehicle_number;
//     private double insurance_number;
//     private String color;
//     String fuel;

//     Vehicle(String vehicle_number,double insurance_number,String color,String fuel)
//     {
//         this.vehicle_number=vehicle_number;
//         this.insurance_number=insurance_number;
//         this.color=color;
//         this.fuel=fuel;

//     }

//     public String getVehicleNumber() {
//         return vehicle_number;
//     }

//     public double getInsuranceNumber() {
//         return insurance_number;
//     }

//     public String getColor() {
//         return color;
//     }

//     String getConsumption()
//     {
//         return this.fuel;
//     } 

//     void dispalyVehicleDeatials()
//     {
//         System.out.println("\nVehicle Complete Information:");
//         System.out.println("Vehicle Number: " + getVehicleNumber());
//         System.out.println("Insurance Number: " + getInsuranceNumber());
//         System.out.println("Color: " + getColor());
//         System.out.println("Fuel consumption type: "+getConsumption());
//     }

// }


// class TwoWheeler extends Vehicle
// {
//     private String name;
//     private String type;
//     public TwoWheeler(String name,String type,String vehicleNumber, double insuranceNumber, String color,String fuel)
//     {
//         super(vehicleNumber, insuranceNumber, color,fuel);
//         this.name=name;
//         this.type=type; 
//     }
//     public String getName()
//     {
//         return name;
//     }
//     public String getType()
//     {
//         return type;
//     }
//     void getMilage()
//     {
//         System.out.println("Two wheeler will give milage: (20-85) km/lit");
//     }

//     void Average()
//     {
//         System.out.println("Two wheeler will give milage: (52.5) km/lit");
//     }
//     @Override
//     void dispalyVehicleDeatials()
//     {
//         System.out.println(this.getName());
//         System.out.println(this.getType());
//         super.dispalyVehicleDeatials();
//         getMilage();
//         Average();
//         // System.out.println();
//     }
// }


class Geared extends TwoWheeler
{
    private boolean geared; 
    Geared(String name,String type,String vehicleNumber, double insuranceNumber, String color,String fuel)
    {
        super(name,type,vehicleNumber,insuranceNumber, color,fuel);

    }
    public void setGeared(boolean geared)
    {
        this.geared = geared;
    }

    @Override
    void getMilage() 
    {
        super.getMilage();
        System.out.println("Geared whechile will give more Milage than no gared  Vechicle");
    }
    void getVechileDeatials()
    {
        super.dispalyVehicleDeatials();
        System.out.println("Gear System: "+geared);
    }
}

class NonGeared extends TwoWheeler
{
    private boolean geared; 
    NonGeared(String name,String type,String vehicleNumber, double insuranceNumber, String color,String fuel)
    {
        super(name,type,vehicleNumber,insuranceNumber, color,fuel);

    }
    public void setGeared(boolean geared)
    {
        this.geared = geared;
    }

    @Override
    void getMilage() 
    {
        super.getMilage();
        System.out.println("NonGeared whchile will give RELATIVELY less Milage than Geared  Vechicle");
    }
    void getVechileDeatials()
    {
        super.dispalyVehicleDeatials();
        System.out.println("Gear System: "+geared);
    }
}


public class TwoWheelerExtension 
{
    public static void main(String args[])
    {
        Geared splender=new Geared("CBUNICORN", "BIKE", "TS 09 GS 6789", 987, "Silver", "Petrol");
        splender.setGeared(true);
        splender.getVechileDeatials();

        NonGeared jupiter=new NonGeared("Juiter","scooter","TS 20 GD 6789",987543,"Grey","Petrol");
        jupiter.setGeared(false);
        jupiter.getVechileDeatials();
    }
}
