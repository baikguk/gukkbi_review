import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02 {
    static String[] name = new String[1000];
    static String[] num = new String[1000];
    static int n =0;
    public static void main(String[] args)  {

        try{
            Scanner infile = new Scanner(new File("input.txt"));
            while (infile.hasNext()) {
                name[n] = infile.next();
                num[n] = infile.next();
                n++;
            }
            infile.close();
        }catch (FileNotFoundException e){
            System.out.println("no file");
            System.exit(1);
        }

        bubbleSort(n,name,num);
        for (int i = 0; i < n; i++) {
            System.out.println("이름 :"+name[i]+"번호"+num[i]);
        }

    }

    private static void bubbleSort(int n, String[] name, String[] num) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (name[j].compareTo(name[j + 1])>0) {
                    String tmp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tmp;

                    tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
    }
}
