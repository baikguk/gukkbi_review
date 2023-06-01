// theData = (E[]) new Object[INIT_CAPACITY]; ->타입 안전성을 위해 권장하지 않음
// 제네릭을 불공변하기 때문에 이후 런타임 에러가 발생가능성이 있음
// 불공변 하다는 것은 제네릭이 런타임에서 소거되어 E에 들어온 타입으로만 보장함
//                                     ㄴ MyArrayList<E> -> MyArrayList
//  cf) 비한정적 와일드카드 타입("?")을 사용하거나, 강제 형변환을 통해 억지로 쓸 수 있긴함
//                  ㄴ 비한정적 와일드카드는 모든 제네릭 타입을 가질 수 있음
//                                      ㄴ raw 타입으로 정의한 List와 동일


// Object[] objects = new String[1]; -> 런타임에서 objects는 String[]이 됨
//objects[0] = 1; // 런타입에서 예외발생
// 배열은 런타임에서 실체화함
// 자바 사용이유중 정적인 컴파일 언어로 시스템의 안정성을 높여주기 위함인데
// 위 배열 같은 상황은 이를 보장해주지 않음

package section01;

import java.util.Arrays;

public class MyArrayList<E> {
    private E [] theData;
    private int size;
    private static final int INIT_CAPACITY=10;
    private int capacity = INIT_CAPACITY;
    public MyArrayList() {
        theData = (E[]) new Object[INIT_CAPACITY];
        size=0;
    }

    public void add(int index, E anEntry) {
        if(index<0 || index>size){ // 오류 및 예외 상황
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if(size>=capacity){
            reallocate();
        }
        for (int i = size - 1; i >= index; i--) {
            theData[i+1] = theData[i];
        }
        theData[index] = anEntry;
        size++;
    }
    private void reallocate() {
        capacity*=2;
        theData = Arrays.copyOf(theData, capacity);
//      다른 방법 ->  E[] tmp = (E[]) new Object[capacity * 2]; for 문으로 복사
    }
    public E get(int index) {
        if(index<0 || index>=size){ // 오류 및 예외 상황
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    }

    public E set(int index, E newValue) {
        if(index<0 || index>size){ // 오류 및 예외 상황
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E oldValue = theData[index];
        theData[index] = newValue;
        return oldValue;
    }

    public E remove(int index) {
        if(index<0 || index>size){ // 오류 및 예외 상황
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E returnValue = theData[index];
        for (int i = index; i <size-1; i++) {
            theData[i] = theData[i+1];
        }
        size--;
        return returnValue;
    }

    public void add(E anEntry) { //배열 맨뒤에 추가
        add(size, anEntry);
    }

    public int size() {
         return size;
    }

    public int indexOf(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (theData[i].equals(anEntry)) { // 기능에 맞게 equals 오버라이딩 필요
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        MyArrayList<String> test =new MyArrayList<>();
//        try {
//            test.add(1,"hello");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("---------------");
//        }
//         ㄴ 리스트 추가 메소드에서 발생하는 예외 처리
    }

}
