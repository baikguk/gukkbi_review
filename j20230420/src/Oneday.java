public class Oneday  extends Event{

    private MyDate date;

    public Oneday(String title, MyDate date) {
        super(title);
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + date.toString();
    }

    @Override
    public boolean showable(String[] find_date) {
        return this.date.year==Integer.parseInt(find_date[0])
                &&this.date.month==Integer.parseInt(find_date[1])
                &&this.date.day==Integer.parseInt(find_date[2]);
    }
}
