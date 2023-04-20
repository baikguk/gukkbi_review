import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Scheduler {

    private int capacity = 10;
    public Event[] events = new Event[capacity];
    public int n = 0;
    private Scanner sc = new Scanner(System.in);
    public void processCommand() {
        while (true) {
            System.out.print("$ ");
            String command = sc.next();
            if(command.equals("addevent")){
                String event_kind = sc.next();
                if (event_kind.equals("oneday")) {
                    handleAddOneday();
                } else if (event_kind.equals("duration")) {
                    handleAddDuration();
                } else if (event_kind.equals("deadline")) {
                    handleAddDeadline();
                }
            } else if (command.equals("list")) {
                handleList();
            } else if (command.equals("show")) {
                handleShow();
            } else if (command.equals("exit")) {
                break;
            }
        }
        sc.close();
    }

    private void handleShow() {
        String[] find_date = getDate_str();
        for (int i = 0; i < n; i++) {
            if (events[i].showable(find_date)) {
                System.out.println(events[i]);
            }
        }
    }

    private void handleList() {
        for (int i = 0; i < n; i++) {
            System.out.println(events[i]);
        }
    }

    private void handleAddOneday() {
        System.out.print("when : ");
        String[] date_str = getDate_str();
        MyDate date = new MyDate((parseInt(date_str[0])), parseInt(date_str[1]), parseInt(date_str[2]));
        System.out.print("title : ");
        sc.nextLine();
        String title =sc.nextLine();
        addEvent(date, title);
    }

    private String[] getDate_str() {
        String[] date_str = new String[3];
        date_str = sc.next().split("/");
        return date_str;
    }

    private void addEvent(MyDate date, String title) {
        if(n>=capacity){
            reallocate();// 배열 크기 재할당
        }
        events[n++] = new Oneday(title, date);
    }

    private void reallocate() { //배열 크기 2배로 늘려주기
        Event[] tmp = new Event[capacity * 2];
        for (int i = 0; i < n; i++) {
            tmp[i] = events[i];
        }
        events =tmp;
        capacity*=2;
    }

    private void handleAddDeadline() {
        System.out.print("until : ");
        String[] date_str =sc.next().split("/");
        MyDate date = new MyDate((parseInt(date_str[0])), parseInt(date_str[1]), parseInt(date_str[2]));
        System.out.print("title : ");
        sc.nextLine();
        String title =sc.nextLine();
        events[n++] = new Deadline(title,date);
    }

    private void handleAddDuration() {
        System.out.print("begin : ");
        String[] date_str_begin = sc.next().split("/");
        MyDate date_begin = new MyDate(parseInt(date_str_begin[0]), parseInt(date_str_begin[1]), parseInt(date_str_begin[2]));
        System.out.print("end : ");
        String[] date_str_end = sc.next().split("/");
        MyDate date_end = new MyDate(parseInt(date_str_end[0]), parseInt(date_str_end[1]), parseInt(date_str_end[2]));
        System.out.print("title : ");
        sc.nextLine();
        String title =sc.nextLine();
        events[n++] = new Duration(title,date_begin,date_end);
    }

    public static void main(String[] args) {
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
