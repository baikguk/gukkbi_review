public class Ex03 {
    static int [][] a ={{6,6,3,1},{2,8,0,5},{1,6,5,4},{5,0,7,3}};
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int dir = 0; dir < 8; dir++) {
                    for (int length = 0; length < 4; length++) {
                        int result = computeVal(i,j,dir,length);
                        if (result != -1 && isPrime(result)) {
                            System.out.println(result);
                        }
                    }

                }
            }
        }

    }

    static boolean isPrime(int x_int){
        if(x_int<2) {
            return false;
        }
        for (int i = 2; i * i <= x_int; i++) {
            if (x_int % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int computeVal(int i, int j, int dir, int length) {
        int num=0;
        for (int k = 0; k < length; k++) {
            int digit = getDigit(i,j,dir,k);
            if (digit == -1) {
                return -1;
            }
            num = num*10 + digit;
        }
        return num;
    }

    private static int getDigit(int i, int j, int dir, int k) {
        int x = i; int y = j;
        switch (dir){
            case 0: y+=k;break; case 1: x+=k;y+=k; break; case 2: x+=k;break;
            case 3: x+=k; y-=k;break; case 4: y-=k;break; case 5 : x-=k;y-=k;break;
            case 6: x-=k;break; case 7: x-=k;y+=k;break;
        }
        if (x >= 4 || x < 0 || y >= 4 || y < 0) {
            return -1;
        }
        return a[x][y];
    }
}
