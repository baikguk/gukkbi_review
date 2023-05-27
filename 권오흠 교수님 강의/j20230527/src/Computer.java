public class Computer {

    private String manufacture;
    private String processor;
    private int disckSize;
    private int ramSize;;
    private double processorSpeed;


    public Computer(String manufacture, String processor, int ramSize, int disckSize, double processorSpeed) {
        this.manufacture = manufacture;
        this.processor = processor;
        this.ramSize = ramSize;
        this.disckSize = disckSize;
        this.processorSpeed = processorSpeed;
    }

    public double computerPower() {
        return ramSize*processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getDisckSize() {
        return disckSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacture='" + manufacture + '\'' +
                ", CPU='" + processor + '\'' +
                ", nRam=" + ramSize +
                ", nDisck=" + disckSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }
}
