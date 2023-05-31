package secion01;
public class PolymorphismTest {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.methodA();
        superClass.methodB();


        SuperClass subClass = new SubClass();
        subClass.methodA();
        subClass.methodB();
    }
}


class SuperClass {
    void methodA() {
        System.out.println("SuperClass A ");
    }

    static void methodB() {
        System.out.println("SuperClass B");
    }
}

class SubClass extends SuperClass {
    @Override
    void methodA() {
        System.out.println("SubClass A");
    }
    static void methodB() {
        System.out.println("SubClass B");
    }
}
// 스테텍은 정적 바인딩임 -> 메모리에 올라가서 변경 못함