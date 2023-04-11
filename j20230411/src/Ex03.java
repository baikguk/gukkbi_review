import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    static int k=0;
    static Rect[] rect = new Rect[100];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));
        while (sc.hasNext()) {
            rect[k] = new Rect(new Point(sc.nextInt(),sc.nextInt()), sc.nextInt(), sc.nextInt());
            k++;
        }
        sc.close();

        bubbleSort(rect);
        for (int i = 0; i < k; i++) {
            System.out.println("x = " + rect[i].lu.x +
                    " y = " + rect[i].lu.y+" width = " + rect[i].width
            +" height = " + rect[i].height+" dimension = " + rect[i].dimension);
        }

    }

    static void bubbleSort(Rect[] rect) {
        for (int i = k - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(rect[j].dimension>rect[j+1].dimension){
                    Rect tmp = rect[j];
                    rect[j] = rect[j + 1];
                    rect[j+1]=tmp;
                }
            }
        }
    }
}
