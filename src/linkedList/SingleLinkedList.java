package linkedList;

public class SingleLinkedList<T> {

  public Node<T> head ;
  public Node<T> tail;
  public int size;

  public SingleLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public void addFirst(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.next = head;//새 노드의 다음 노드로 head
    head = newNode;//head가 가르키는 노드를 새 노드로 교체
    size++;
    if(head.next == null) {//데이터가 새 노드밖에 없으면
      tail = newNode;
      //tail = head;
    }

  }

  public void addLast(T data) {
    Node<T> newNode = new Node<>(data);
    if (size == 0) {
      addFirst(data);
      return;
    }
    tail.next = newNode;//tail의 다음 노드가 새 노드를 가르키고
    tail = newNode;//tail은 새로운 노드를 가르키도록 해준다.
    size++;
  }

  public Node<T> searchByIndex(int index){

    Node<T> node = head;//head부터 시작, head가 가르키는 노드 index=0
    for (int i=0; i<index; i++) {
      node = node.next;
    }
    return node;
  }


  public void insert(int index, T data) {
    if (size==0) {addFirst(data); return;}
    if (index == size) {addLast(data); return;}

    Node<T> newNode = new Node<>(data);

    //newNode.next = searchByIndex(index);//새 노드의 next가 삽입할 위치에 있던 노드를 가르키도록 하고
    Node<T> prev = searchByIndex(index-1);//삽입할 노드의 이전 노드
    Node<T> next = prev.next;
    prev.next = newNode;
    newNode.next = next;
    size++;
    //System.out.println("tail "+this.tail.data);

  }

  public void delete(T data) {
    if (size == 0) {return;}
    if(data.equals(head.data)){
      head = head.next;
      size--;
      if(size == 0){tail = null;}
      return;
    }
    Node<T> prev = head;
    Node<T> curr = head;
    while (curr != null){
      if(data.equals(curr.data)){break;}
      prev = curr;
      curr = curr.next;
    }
    prev.next = curr.next;
    if (curr == tail) {tail=prev;}

    size--;
  }



  public void printAll(){

    if(head != null){//가져올 객체가 있다면
      Node<T> node = head;
      System.out.println(node.data);
      while (node.next != null){//node가 더 있다면?
        node = node.next;
        System.out.println(node.data);
      }
    }
  }



}
