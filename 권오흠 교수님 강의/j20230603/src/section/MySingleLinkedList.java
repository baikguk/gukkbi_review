package section;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size;

    public MySingleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T item) {
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
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addFirst(item);
        }else {
            Node<T> p = getNode(index-1);
            addAfter(p,item);
        }
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        } else {
            T removeData = head.data;
            head = head.next;
            size--;
            return removeData;
        }
    }

    public T removeAter(Node<T> before) {
        // 양방향 연결리스트에서는 삭제하기 위해 삭제당하는 노드 전의 객체가 필요함
        if (before.next != null) {
            T removeData = before.data;
            before.next = before.next.next;
            size--;
            return removeData;
        } else
            return null;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        Node<T> before = getNode(index-1);
        return removeAter(before);

    }
    public T remove(T item) {
        Node<T> p =head;
        Node<T> q = null; // 제거를 하기 위해서는 itemㅇ을 갖는 노드의 전 주소가 필요함으로
        while (p != null && !p.data.equals(item)) {
            q=p;
            p= p.next;
        }
        if (p == null) {
            return null;
        }
        if (q == null) {
            return removeFirst();
        }
        return removeAter(q);
    }

    public int indexOf(T item) {
        Node<T> p = head;
        int index = 0;
        while (p != null) {
            if (p.data.equals(item)) {
                return index;
            } else {
                p = p.next;
                index++;
            }
        }
        return -1;

    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
//        Node<T> p = head;
//        for (int i = 0; i < index; ++){
//            p = p.next;
//        }
//        return p.data;
        return getNode(index).data;
    }

    public Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> p = head;
        for (int i = 0; i < index; i++){
            p = p.next;
        }
        return p;
    }

    public static void main(String[] args) {
        MySingleLinkedList<String> list = new MySingleLinkedList<>();
        list.addFirst("Monday");
        list.addFirst("Sunday");
        list.add(2, "Saturday");
        list.add(2, "Friday");
        list.remove("Saturday)");
    }
}
