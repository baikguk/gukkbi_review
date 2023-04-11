public class Rect {
    public Point lu;
    public int width;int height;
    public int dimension;

    public Rect(Point point, int width, int height) {
        this.lu = point;
        this.width = width;
        this.height = height;
        this.dimension=height*width;
    }
}
