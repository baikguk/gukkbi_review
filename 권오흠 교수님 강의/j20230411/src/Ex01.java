public class Ex01 {
    public static void main(String[] args) {
        Person first = new Person();
        first.name = "John";
        first.number = "01033168583";
        System.out.println("Name = " + first.name+ " Number = " + first.number);


        Person[] members = new Person[10];
//        members[2] = new Person();
        members[2].name = "David";
        members[2].number = "0103316858";
        System.out.println("members = " + members[2].name);
        // ㄴ 오류발생 : memebers[2]에 참조되는 객체가 없음
        // members[2] = new Person() 해줘야함
    }
}