package Section1;

public class Ex02 { // wrapper class = primitive 타입을 객체로 포장해줌
    public static void main(String[] args) {
        Object[] arr = new Object[100];
        int a= 20;
        Integer age = new Integer(a); //wrapping
        Integer age2 = a; // Autoboxing
        arr[0]  =age ;
        int b = age.intValue(); // unwrapping
        int b2 = age2; //autounboxing
        int b3 = (Integer)arr[0];
        System.out.println(b);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        String str = "1234";
        int c = Integer.parseInt(str);
        System.out.println("c = " + c);
    }

}
