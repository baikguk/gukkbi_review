import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a =new int[n];
        for (int i = 0; i <n; i++) {
            int temp= sc.nextInt();
            int j = i -1;
            while(j>=0&& temp<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =temp;
            System.out.println(Arrays.toString(a));
        }
    }
}
