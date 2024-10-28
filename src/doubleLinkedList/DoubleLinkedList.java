package doubleLinkedList;

public class DoubleLinkedList<T> {

    public Node<T> head;
    public Node<T> tail;
    public int size;

    public DoubleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){//데이터가 새 노드밖에 없다면?
            tail = newNode;
            return;
        }
        newNode.next.prev = newNode;
        //head.prev = null;
    }

    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            addFirst(data);
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;
        size++;
    }

    public Node<T> search(T data){
        if(size == 0)return head;

        Node curr = head;//얕은 복사=> curr의 data값을 수정하면 head.data 값도 수정됨
        //참고로 깊은 복사, 즉 값이 바뀌어도 복사한 객체의 값에 영향을 미치지 않으려면 new를 통해 완전히 새로운 객체를 생성하면 된다.

        while(!curr.data.equals(data)){//값이 같으면 false, 다르면 true
            curr = curr.next;
        }
        if(curr==null){
            System.out.println("찾는 데이터 없음");
            return null;
        }
        return curr;
    }

    public void insert(T data, T loc, String prevOrNext){//새로 삽입할 데이터와, 삽입할 노드의 데이터
        if (size==0) {addFirst(data); return;}
        Node node = search(loc);
        if (node.next==null) {addLast(data); return;}

        Node newNode = new Node<>(data);

        switch (prevOrNext){
            case "prev":
                {
                    node.prev.next = newNode;
                    newNode.prev = node.prev;
                    newNode.next = node;
                    node.prev = newNode;
                    size++;
                    break;
                }
            case "next":
                {
                    newNode.next = node.next;
                    node.next.prev = newNode;
                    newNode.prev = node;
                    node.next = newNode;
                    size++;
                    break;
                }
        }
    }

    public void delete(T data){
        Node node = search(data);
        if(node == null){
            System.out.println("그런 노드 없음");
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    public void printAll(){

        if(size != 0){//가져올 객체가 있다면
            Node<T> node = head;
            System.out.println(node.data);
            while (node.next != null){//node가 더 있다면?
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

}
