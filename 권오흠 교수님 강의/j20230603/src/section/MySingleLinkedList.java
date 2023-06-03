package section;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size;

    public MySingleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T item){
        Node<T> temp = new Node<>(item);
//        Node<T>[] arr = new Node<T>[100];
//        T t = new T();
//        T[] t_arr = new T[100];
//               ㄴ 문법적으로 불가함

        // head 주소를 먼저 할당하면 기존 head 주소를 잃어버려서
        // 서순이 중요함
        temp.next = head;
        head = temp;
        size++;

    }

    public void addAfter(Node<T> before, T item) {
        Node<T> temp = new Node<>(item);
        temp.next = before.next; // 서순 지켜야 함
        before.next = temp;
        size++;
    }

//    public void addBefore(Node<T> after, T item) {
//        // 간단하지 않음 after을 가르키는 노드를 찾는게 쉽지않음
//        //
//        Node<T> temp = new Node<>(item);
//
//
//    }
    public void add(int index, T item){

    }

    public T removeFirst(){
        if(head == null){
            return null;
        }else{
            T removeData = head.data;
            head = head.next;
            size--;
            return removeData;
        }
    }

    public T removeAter(Node<T> before) {
    // 양방향 연결리스트에서는 삭제하기 위해 삭제당하는 노드 전의 객체가 필요함
        if(before.next != null) {
            T removeData = before.data;
            before.next = before.next.next;
            size--;
            return removeData;
        }else
            return null;
    }

    public void remove(int index) {

    }

    public int indexOf(T item) {
        Node<T> p = head;
        int index = 0;
        while (p != null) {
            if (p.data.equals(item)) {
                return index;
            }else {
                p = p.next;
                index++;
            }
        }
        return -1;

    }

    public T get(int index) {
        return null;
    }


    public static void main(String[] args) {
        MySingleLinkedList<String> str_list =new MySingleLinkedList<>();
        str_list.add(0,"Saturday");
        str_list.add(1,"Friday");
        str_list.add(0, "Monday");
        str_list.add(3, "Tuesday");

        String str = str_list.get(2);
        str_list.remove(2);
        int pos = str_list.indexOf("Friday");
    }
}
