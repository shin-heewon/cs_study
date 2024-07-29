package stack;


public class Stack<T> {

  public Node<T> head ;
//  public Node<T> rear;
  public int size;

  public Stack(){//초기화
    head = null;
    size =0;
  }
/*
* 구현할 기능
* 1. 큐가 비었는지 확인 : isEmpty()
* 2. 데이터 삽입 : push(data) -> head가 새 노드 가르키도록 하기
* 3. 데이터 삭제 : pop -> head가 head.next 노드 가르키도록 하기
* 4. print 메소드
*
* */

  public boolean isEmpty(){
    return head == null;
  }

  public void push(T data){
    Node<T> newNode = new Node<>(data);
    if(!isEmpty()){
      newNode.next = head;
    }

    head = newNode;
    size++;
  }

  public T pop(){
    if(isEmpty()){
      System.out.println("stack 비었음");
      return null;
    }

    T data = head.data;

//    //큐에 노드 하나만 있으면?
//    if(size == 1){
//      head = null;
//    }

    head = head.next;
    size--;
    return data;
  }

  public void printAll(){
    if(isEmpty()){
      System.out.println("stack 비어있음");
    }
    Node<T> node = head;
    System.out.println(head.data);
    while (node.next != null){
      node = node.next;
      System.out.println(node.data);
    }
  }

}
