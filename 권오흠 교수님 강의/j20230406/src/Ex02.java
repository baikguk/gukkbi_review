public class Ex02 {
    public static void main(String[] args) {

        for(int n =2; n<=100000;n++) {
            boolean isPrime = true;
            // 약수는 쌍을 가지고 sqrt(n)보다 클 수없이
            for (int i = 2; i * i <= n && isPrime; i++) {
                if (n % i == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}
