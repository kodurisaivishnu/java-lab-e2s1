 abstract class Shape
{
    abstract double getArea();
    abstract double getperimeter();
}

class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    double getArea()
    {
        return Math.PI*radius*radius;
    }

    @Override
    double getperimeter()
    {
        return 2*Math.PI*radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int a)
    {
        this.length=this.breadth=a;
    }

    @Override
    double getArea()
    {
        return length*breadth;
    }
    @Override
    double getperimeter()
    {
        return 2*(length+breadth);
    }
}


public class polymorphism
{
    public static void main(String args[])
    {
        // Dynamic method dispatch =parent refference and child object but can only access parent methods which are avilabel in child

        Circle Circle1=new Circle(2);
        Shape Rectangle1=new Rectangle(3,4);
        Shape Rectangle2=new Rectangle(3);

        System.out.println("Area of circle: "+Circle1.getArea()+"\nperimeter of circle1: "+Circle1.getperimeter());

        System.out.println("\nArea ofRectangle1: "+Rectangle1.getArea()+"\nperimeter of Rectangle1: "+Rectangle1.getperimeter());
        System.out.println("\nArea ofRectangle2: "+Rectangle2.getArea()+"\nperimeter of Rectangle2: "+Rectangle2.getperimeter());

    }
}