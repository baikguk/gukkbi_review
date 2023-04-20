public class Event {
    protected String title;

    public Event(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title +", ";
    }

    public boolean showable(String[] find_date) {
        return false;
    }

}
