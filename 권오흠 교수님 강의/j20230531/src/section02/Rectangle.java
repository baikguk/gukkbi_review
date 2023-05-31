package section02;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return (double)width*height;
    }
    public double computePerimeter() {
        return 2.0*(width+height);
    }

    public String toString() {
        return "Rectangle : width is " +width + ", height is " + height;
    }
}
