/*
    java compiler : 사람이 작성한 source를 byte code로 변환
    source code  -> byte code로 변환 -> 실행코드(binary code -> 기계어)
      ㄴ확장자 java    ㄴ 확장자 class      ㄴ JVM이 실행(JIT Compiler)
    JIT : just in time compliation
          인터프리트 방식과 정적 컴파일 혼합
            ㄴ 실행중 기계어 번역 ㄴ 실행전 프로그램 코드 기계어 번역
          인터프리 방식으로 기계어 코드 생성 및 캐싱하여 반복실행시 재생성 방지
    JDK ( Java Development Kit) : JVM,JRE에 의해 실행되어 자바 프로그램생성
      ㄴ 운영체제 별로 있어 호환이 좋음
      ㄴ JRE(Java Runtime Environment) : JVM을 생성하는 디스크상 부분
                            ㄴ 자바 코드를 실행및 구동하기 위한 도구들로 구성
      ㄴ JDK : 자바 기반 소프트웨어를 개발하기 위한 도구
*/

//변수 규칙 :
//  ㄴ 대소문자 구별함,길이 제한x, 예약어로 사용못함 (ex: int,True)
//  ㄴ 숫자 시작 못함 ,특수만자 _ , $ 만 가능
//  ㄴ 한국어도 가능한데 오류 날지도

// 변수 관습:
//  ㄴ 변수,메소드 모두 소문자, 클래스명 첫글자 대문자
//  ㄴ 단어연결시 이어진첫글자 대문자 ex : lastIndexOf()
//  ㄴ 상수 모두 대문자

public class Ex01 {
    /*
    // 멤버변수 초기화 필수아님
        //      ㄴ 자동 초기화
                ㄴ 숫자형(byte, short,int , long, float, double)
                    ㄴ   0(0.0) 으로 초기화
                ㄴ 논리형 False로 초기화
                ㄴ 문자형 char : null 이라는 글자로 초기화
                ㄴ 참조형 null 값으로 초기화함
                    cf) String 타입에 null 할당시 해당 변수에 주소 저장 x
                        String 타입에 "" 할당시 빈문자열 data주소 저장
    // 지역변수는 초기화 필수
    */
    static char ch1;
    static String str1;

    // main 메소드 : java program은 JVM이 호출한 main method 에서 시작
    public static void main(String[] args) {

        char ch2 = '\u0000'; //-> 공백문자 자동초기화시 들어가는 값
        System.out.print("print : 띄어 쓰기 안댐 \n");
        System.out.println("println : 애는 줄바꿈 해줌");
        System.out.printf("%s : %d, %s : %f  , %c\n",
                "정수",1,"실수",1.0, 'C');

        System.out.println("10 + 20 = " + 10 + 20);
        System.out.println("10 + 20 = " + (10 + 20));
        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "" + 7);

        System.out.printf("\"hello\"\n"); //따옴표안에 따옴표

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(str1);
    }
}
