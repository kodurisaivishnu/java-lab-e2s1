class Vehicle
{
    private String vehicle_number;
    private double insurance_number;
    private String color;
    String fuel;

    Vehicle(String vehicle_number,double insurance_number,String color,String fuel)
    {
        this.vehicle_number=vehicle_number;
        this.insurance_number=insurance_number;
        this.color=color;
        this.fuel=fuel;

    }

    public String getVehicleNumber() {
        return vehicle_number;
    }

    public double getInsuranceNumber() {
        return insurance_number;
    }

    public String getColor() {
        return color;
    }

    String getConsumption()
    {
        return this.fuel;
    } 

    void dispalyVehicleDeatials()
    {
        System.out.println("\n\nVehicle Complete Information:");
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Insurance Number: " + getInsuranceNumber());
        System.out.println("Color: " + getColor());
        System.out.println("Fuel consumption type: "+getConsumption());
    }

}

class TwoWheeler extends Vehicle
{
    private Boolean geared;
    public TwoWheeler(String vehicleNumber, double insuranceNumber, String color,String fuel)
    {
        super(vehicleNumber, insuranceNumber, color,fuel);
    }
    void getMilage()
    {
        System.out.println("Two wheeler will give milage: (20-85) km/lit");
    }

    void Average()
    {
        System.out.println("Two wheeler will give milage: (52.5) km/lit");
    }
    public void setGeared(Boolean geared) {
        this.geared = geared;
    }
    @Override
    void dispalyVehicleDeatials()
    {
        super.dispalyVehicleDeatials();
        getMilage();
        Average();
        System.out.println("Gear System: "+geared);
        System.out.println();
    }
}

class FourWheeler extends Vehicle
{
    private boolean geared;
    FourWheeler(String no,double i_no,String col,String fuel)
    {
        super(no,i_no,col,fuel);
    }
    void getMilage()
    {
        System.out.println("Four wheeler will give milage (5-25)km/lit");
    }
    void Average()
    {
        System.out.println("Average of Four wheeler is 12 km/lit");
    }
    void setGeared(boolean val)
    {
        this.geared=val;
    }

    @Override
    void dispalyVehicleDeatials()
    {
        super.dispalyVehicleDeatials();
        getMilage();
        Average();
        System.out.println("Gear System: "+geared);
        System.out.println();
    }
}

public class VehicleTest
{
    public static void main(String args[])
    {
        TwoWheeler splender=new TwoWheeler("TS 08 AB 2374", 123456789, "RED", "Petrol");
        splender.setGeared(true);
        splender.dispalyVehicleDeatials();

        FourWheeler ford=new FourWheeler("Ts 08 GF 1273", 987654321,  "Blue_vita", "Disel");
        ford.setGeared(true);
        ford.dispalyVehicleDeatials();
    }
}
