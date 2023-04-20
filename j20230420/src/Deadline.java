public class Deadline extends Event {
    private MyDate deadline;

    public Deadline(String title, MyDate date) {
        super(title);
        this.deadline = date;
    }

    @Override
    public String toString() {
        return super.toString()+ deadline.toString();
    }

    @Override
    public boolean showable(String[] find_date) {
        return this.deadline.year >= Integer.parseInt(find_date[0])
                && this.deadline.month >= Integer.parseInt(find_date[1])
                || this.deadline.day >= Integer.parseInt(find_date[2]);
    }
}
