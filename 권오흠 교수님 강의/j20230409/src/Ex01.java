import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] data = new int[n];

        for (int i = 0; i < n; i++) {
          data[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        bubbleSort(n,data);

        System.out.println(Arrays.toString(data));
    }

//    static void bubbleSort(int n, int[] data) {
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if(data[j]>data[j+1]){
//                    int tmp = data[j];
//                    data[j] =data[j+1];
//                    data[j+1] =tmp;
//                }
//            }
//        }
//    }

    static void bubbleSort(int n, int[] data) { // 하지만 배열의 toString은 주소값임으로 갑변경이 가능했던것
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(data[j],data[j+1]); // primitive인 경우
                                            //actual parameter 이경우는 정령이 안됨, 값에 의한 호출 (c++에서 참조에 의한 호출을 하면 정상으로 정렬됨 ex) &a
                                        // actual 파라미터와 formal 파라미터의 메모리상 위치는 다름 -> 전혀 다른 변수임
                                        // 메소드를 호출했을 때 복사를 해 메소드를 실행함
            }
        }
    }
    static void swap(int a, int b) {//formal paramter
        if(a>b){
            int tmp = a;
            a =b;
            b =tmp;
        }

    }
}
