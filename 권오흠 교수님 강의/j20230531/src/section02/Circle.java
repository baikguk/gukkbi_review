package section02;

public class Circle extends Shape{
    public int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public double computeArea() {
        return (double)radius*radius*Math.PI;
    }
    public double computePerimeter()
    {
        return 2.0*radius*Math.PI;
    }

    public String toString() {

        return "Circle : radius is " +radius ;
    }
}
