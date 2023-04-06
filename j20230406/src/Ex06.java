import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
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
            String sum="";
            for (int j = i; j < n; j++) {
                sum = sum+ a[j];
                int sum_int = Integer.parseInt(sum);
                for (int k = 2; k * k <sum_int ; k++) {
                    if(sum_int%k==0){
                        sum_int=0;
                        break;
                    }else
                        isPrime =true;
                }
                if(max<sum_int && isPrime){
                    max=sum_int;
                }
            }
//            for (int j = i; j < n; j++) {
//                sum = sum+ a[j];
//                int sum_int = Integer.parseInt(sum);
//                isPrime = true;
//                for (int k = 2; k * k <sum_int && isPrime ; k++) {
//                    if(sum_int%k==0){
//                        isPrime=false;
//                    }
//                    if(max<sum_int && isPrime){
//                        max=sum_int;
//                    }
//                }
//            }
        }
        if(max>0){
            System.out.println(max);
        }else
            System.out.println("합해서 소수가 되는 경우가 없습니다");

    }
}
