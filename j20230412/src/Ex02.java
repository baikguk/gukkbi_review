import java.util.Scanner;

public class Ex02 {
    static int count_point;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_point = sc.nextInt();
        int[][] point_arr = new int[count_point][2];
        for (int i = 0; i < count_point; i++) {
            point_arr[i][0] = sc.nextInt();
            point_arr[i][1] = sc.nextInt();
        }
        int[] check_point = new int[2];
        check_point[0] = sc.nextInt();
        check_point[1] = sc.nextInt();

        boolean result = check_in_out(point_arr,check_point);
    }

    private static boolean check_in_out(int[][] point_arr, int[] check_point) {
        boolean check_x = false;
        boolean check_y = false;
        int x = check_point[0];
        int y = check_point[1];
        int [] non_duplex = non_duple(point_arr,0);
        int [] non_dupley = non_duple(point_arr,1);
        for (int i = 0; i < count_point; i++) {
            point_arr[][]
        }
        return check_x&&check_y;
    }

    private static int[] non_duple(int[][] a,int n) {
        int[] nondu_a = new int[count_point/2];
        for (int i = 0; i*2 < a.length; i++) {
            nondu_a[i] = a[i][n];
        }
        return nondu_a;
    }
}
