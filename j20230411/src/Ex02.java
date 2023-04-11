import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02 {
    static Person[] member = new Person[100];
    static  int n = 0;

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String nm = sc.next();
                String nb = sc.next();
                member[n]= new Person();
                member[n].number = nb;
                member[n].name = nm;
                n++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bubbleSort();
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + member[i].name+"  Number : " + member[i].number);
        }
    }
    static void bubbleSort() {
        for (int i = n-1; i >0;i--) {
            for (int j = 0; j < i; j++) {
                swap(j);

            }
        }
    }

    private static void swap(int j) {
        if (member[j].name.compareToIgnoreCase(member[j + 1].name) > 0) {
            Person tmp = member[j];
            member[j] = member[j + 1];
            member[j+1] = tmp;
        }
    }
}
