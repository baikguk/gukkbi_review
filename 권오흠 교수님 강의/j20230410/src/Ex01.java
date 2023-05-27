import java.io.*;
import java.util.Scanner;

public class Ex01 {
    static  String[] words = new String[100000];
    static int[] count = new int[100000];
    static int n = 0;
    public static void main(String[] args) {
        //인덱스 메이커
        Scanner kb = new Scanner(System.in);
        label:
        while(true){
            System.out.print("$ ");
            String command = kb.next();
            switch (command) {
                case "read":
                    String fileName = kb.next();
                    makeIndex(fileName);
                    break;
                case "find": {
                    String str = kb.next();
                    int index = findWord(str);
                    if (index > -1) {
                        System.out.println(words[index] + " appears " + count[index] + " times.");
                    } else
                        System.out.println(str + " does not appear ");
                    break;
                }
                case "saveas": {
                    String str = kb.next();
                    saveAs(str);
                    break;
                }
                case "exit":
                    break label;
            }

        }
        kb.close();
        for (int i = 0; i < n; i++) {
            System.out.println("words = " + words[i]+" / count : " + count[i]);
        }
    }

    static void makeIndex(String filename) {
        try {
            Scanner inFile = new Scanner(new File(filename));
            while (inFile.hasNext()) {
                String str = inFile.next();
                addWord(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }
    }

    static void addWord(String str) {
        int index = findWord(str);
        if (index != -1) {
            count[index]++;
        }else {
            words[n]=str;
            count[n] =1;
            n++;
        }
    }
    static int findWord(String str) {
        for (int i = 0; i < n; i++) {
            if (words[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    static void saveAs(String str) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(str));
            for (int i = 0; i < n; i++) {
                pw.println(words[i]+" "+count[i]);
            }

            pw.close();
        } catch (IOException e) {
            System.out.println("save failed");
        }
    }
}
