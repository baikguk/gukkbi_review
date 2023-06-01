package section02;

public abstract class Shape{
    public  String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double computeArea();
    public abstract double computePerimeter ();

    public int compareTo(Object o) { //추상 클래스라 인터페이스 구현안해줘도 에러 없음
        double myArea = computeArea();
        double yourArea = ((Shape)o).computeArea();
        if(myArea< yourArea)
            return -1;
        else if (myArea>yourArea) {
            return 1;
        }else return 0;
    }
}
