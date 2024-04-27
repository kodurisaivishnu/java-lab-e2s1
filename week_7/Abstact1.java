/*

Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). 

Reuse this class to calculate the area
and volume of circle ,cube and sphere.

*/

abstract class Shape
{
    abstract double GetArea();
    abstract double GetVolume();
}

class Circle extends Shape
{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double GetArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double GetVolume()
    {
        System.out.println("Circle does not have volume");
        return 0;
    }
}

class Cube extends Shape
{
    double side;
    public Cube(double side)
    {
        this.side=side;
    }

    @Override
    double GetArea()
    {
        return 6*side*side;
    }
    @Override
    double GetVolume()
    {
        return side*side*side;
    }
}

class Sphere extends Shape
{
    double  radius;
    Sphere(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double GetArea()  
    {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double GetVolume()
    {
        return (4/3)*Math.PI*radius*radius*radius;
    }
}

public class Abstact1
{
    public static void main(String args[])
    {
        Shape circle=new Circle(2);
        System.out.println(circle.getClass());
        System.out.println("Volume of Cirle: "+circle.GetVolume());
        System.out.println("Area of circle: "+circle.GetArea());

        System.out.println();
        Shape cube=new Cube(2);
        System.out.println(cube.getClass());
        System.out.println("Cube Area: "+cube.GetArea());
        System.out.println("Volume of cube: "+cube.GetVolume());

        System.out.println();
        Shape sphere=new Sphere(2);
        System.out.println(sphere.getClass());
        System.out.println("Area of Sphere: "+sphere.GetArea());
        System.out.println("Volume of Sphere: "+sphere.GetVolume());
    }
}