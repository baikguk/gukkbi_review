import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        byte b1 = 127;
        System.out.println(b1);
        b1 = (byte)(b1+1);
        //-128
        System.out.println(b1); //byte 크기는 -128~127때문에 overflow

        /*
        자동 형변환 : 정수에서 실수 조심
        1byte  2byte    4byte  8byte   4byte    8byte
        byte ->short -> int -> long -> float -> double
                char -> int
        강제 형변환 : 범위 밖의 형변환 시 데이터 손실 될 수도
         */

        // char 대소문자 변경
        char ch1 = 'a';
        char upper_a = (char)(ch1-('a'-'A'));
        System.out.println(upper_a);
        System.out.println((char)(upper_a + ('a'-'A')));

        //사용자 입력값 받기 Scanner 객체
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 받아보기");
        int i1 = sc.nextInt();
        System.out.printf("입력하신 정수는 %d 입니다",i1,"\n");
        String str1 = String.valueOf(i1);
        System.out.println("입력한 정수를 문자열로 바꾸면"+str1);

        System.out.println(10.0F);

        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        /*
            literal data 는 java source가 class loader에 의해서
            Method Area에 loading 될 때
            Method Area 의 한 부분인 constant pool 이라는 메로리 영역에 저장됨
            이 영역에서 문자열을 올릴 때 , 이전에 올린 문자열고 같은 문자열을 올림
            문자열이 새로 올라가지 않고 이전에 먼저 올라가 있는 문자열을 사용함
            하지만 객체로 선언하면 객체 자체의 주소는 달라지지만 객체에 할당된
            주소는 동일함
        */
        //객체는 hashcode가 다르지만 String이 같은 이유눈
        //STring에 hashcode가 오버라이딩 되었기 때문
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode("hello"));
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(str2.equals("HELLO"));
        System.out.println(str2.equalsIgnoreCase("HELLO"));

        // 자바에서 and -> && , or -> ||

        /*
         비트 연산자 : &, |, ^(배타적 논리함), ~
         & : bit가 모두 1일 때 1반환
         | : 하나라고 1이면 1바놘
         ^ : 비트가 서로 다를때 1반환
         ~ : 비트를 반대로 바꿈 0 ->1 , 1-> 0
         */
    }
}
