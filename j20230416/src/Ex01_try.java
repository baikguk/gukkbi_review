import java.util.Scanner;

public class Ex01_try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        int[] a_nonduple = new int[n / 2];
        int[] point = new int[2];
        for(int i =0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        point[0] =sc.nextInt();
        point[1] = sc.nextInt();

        a_nonduple = non_duple(a);
        boolean result = check_point(a_nonduple,point);
        if (result) {
            System.out.println("점 p는 다각형 외부에 있습니다");
        }else
            System.out.println("점 p는 다각형 내부에 있습니다");

    }

    private static boolean check_point(int[] a_nonduple,int[] point) {
        int count=0;
        for (int i : a_nonduple) {
            if (i > point[0]) {
                count++;
            }
        }
        return count % 2 == 0;
    }

    private static int[] non_duple(int[][] a) {
        int[] non_duple = new int[a.length / 2];
        for(int i=0;i<a.length;i+=2){
                non_duple[i/2] = a[i][0];
        }
        bubbleSort(non_duple);
        return non_duple;
    }

    private static void bubbleSort(int[] non_duple) {
        for (int i = non_duple.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(non_duple[j]>non_duple[j+1]) {
                    int tmp = non_duple[j];
                    non_duple[j] = non_duple[j + 1];
                    non_duple[j + 1] =tmp;
                }
            }
        }
    }

}
