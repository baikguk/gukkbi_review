import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();//enter로 구분
        String s1 = sc.next(); // spacebar로 구분

        if (s1.equals("s1")) {
            System.out.println("s1 check");
        }

        if (s2.equals("s1 s2")) {
            System.out.println("s2 check");
        }
    }
}
