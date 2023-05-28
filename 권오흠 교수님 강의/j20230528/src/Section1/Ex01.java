package Section1;

import java.util.Arrays;

public class Ex01 {
    public  int a;
    public  double x;

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        Ex01 ex02 = new Ex01();
        System.out.println(ex01.toString()); //Section1.Ex01@5594a1b5

        if (ex02.equals(ex01)) {
            System.out.println("yes");
        }else
            System.out.println("no");
    }
    public String toString(){
        return  a +" " +x;
    }
    public boolean equals(Object obj) {
        Ex01 ex = (Ex01) obj;
        return a==ex.a && x == ex.x;
    }
}
