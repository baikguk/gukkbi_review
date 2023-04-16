public class OrthoLine {
    public MyPoint u;
    public MyPoint v;

    public OrthoLine(MyPoint u, MyPoint v) {
        this.u = u;
        this.v = v;
    }

    public boolean isVertical() {
        return (u.x == v.x);
    }

    public boolean intersects(OrthoLine pointline) {
        if (isVertical() && !pointline.isVertical()) {

        } else if (!isVertical() && pointline.isVertical()) {

        }else
            return false; 
    }
}
