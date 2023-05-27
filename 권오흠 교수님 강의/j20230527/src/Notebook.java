public class Notebook  extends Computer{
    public double scrennSize;
    public double weight;

    public Notebook(String manufacture, String processor, int ramSize, int disckSize, double processorSpeed, double scrennSize, double weight) {
        super(manufacture, processor, ramSize, disckSize, processorSpeed);
        this.scrennSize = scrennSize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"Notebook{" +
                "scrennSize=" + scrennSize +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Computer nt = new Notebook("Dell","i5",4,1000,3.2,15.6,1.2);

        System.out.println("nt.computerPower() = " + nt.computerPower());
        System.out.println("nt = " + nt.toString()); //dynamic binding(동적바인딩) 실행시 결정됨
        //                                             static binding 컴파일시 결정됨
    }
}
