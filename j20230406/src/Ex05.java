import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int max =0;
        boolean isPrime = false;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0 || a[i] > 10) {
                i -=1;
            }
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                for (int k = 2; k * k < sum; k++) {
                    if(sum%k==0){
                        sum=0;
                        break;
                    }else
                        isPrime =true;
                }
                if(max<sum && isPrime){
                    max=sum;
                }
            }
        }
        if(max>0){
            System.out.println(max);
        }else
            System.out.println("합해서 소수가 되는 경우가 없습니다");

    }
}
