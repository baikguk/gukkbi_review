package section02;

public class RtTriangle extends Shape{
    public int width;
    public int height;

    public RtTriangle(int width, int height) {
        super("RtTriangle");
        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return (double)width*height/2;
    }
    public double computePerimeter() {
        return (double)(width+height+ Math.sqrt(width*width+height*height));
    }

    public String toString() {
        return "Triangle : width is " +width + ", height is " + height;
    }
}
