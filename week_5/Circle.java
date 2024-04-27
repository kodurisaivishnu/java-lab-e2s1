import java.util.*;

public class Circle {
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double GetCircleArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }
    double GetCirclePerimeter()
    {
        return 2*Math.PI*radius;
    }
}

class Test
{
    public static void main(String args[])
    {
        Circle c=new Circle(1);
        
        System.out.println(c.GetCircleArea());
        System.out.println(c.GetCirclePerimeter());
    }
}
