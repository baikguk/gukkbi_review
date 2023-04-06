import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        int n = sc.nextInt();
        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int max=0;
        Loop1:
        for (int i = 0; i < n; i++) {
            int sum=0;
            Loop2:
            for (int j = i; j < n; j++) {
                    sum += a[j];
                if (max < sum) {
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
}
