public class Duration extends Event {
    private MyDate date_begin;
    private MyDate date_end;

    public Duration(String title, MyDate date_begin, MyDate date_end) {
        super(title);
        this.date_begin = date_begin;
        this.date_end = date_end;
    }
    @Override
    public String toString() {
        return  super.toString() + date_begin.toString() +
                " ~ " + date_end.toString();
    }

    @Override
    public boolean showable(String[] find_date) {
        return this.date_begin.year<=Integer.parseInt(find_date[0])
                &&this.date_end.year>=Integer.parseInt(find_date[0])
                &&this.date_begin.month<=Integer.parseInt(find_date[1])
                &&this.date_end.month>=Integer.parseInt(find_date[1])
                &&this.date_begin.day<=Integer.parseInt(find_date[2])
                &&this.date_end.day>=Integer.parseInt(find_date[2]);

    }
}
