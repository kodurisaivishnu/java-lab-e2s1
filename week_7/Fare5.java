/*
Create an Interface Fare with method getAmount() to get the amount paid for fare
of travelling. 

Calculate the fare paid by bus and train implementing interface Fare.
*/

interface Fare
{
    double getAmount(double distance,double farePerkm);
}

class Bus implements Fare
{
     public double getAmount(double distance,double farePerkm)
     {
        return distance*farePerkm;
     }
}

class Train implements Fare
{
     public double getAmount(double distance,double farePerkm)
     {
        return distance*farePerkm;
     }
}

public class Fare5 {
    public static void main(String args[])
    {
        Fare bus=new Bus();
        System.out.println("BUS FARE: $"+bus.getAmount(1, 5));

        Fare Devagiri_Train=new Train();
        System.out.println("Train FARE: $"+Devagiri_Train.getAmount(200, 0.3));
    }
}
