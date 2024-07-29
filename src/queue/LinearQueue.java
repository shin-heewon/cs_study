package queue;


public class LinearQueue<T> {

  public Node<T> front ;
  public Node<T> rear;
  public int size;

  public LinearQueue(){//초기화
    front = null;
    rear = null;
    size =0;
  }
/*
* 선형 큐 : 데이터 삽입, 삭제 반복하면 쏠림 현상 발생함 => 원형 큐 구조로 해결 가능
* list로 구현
* 구현할 기능
* 1. 큐가 비었는지 확인 : isEmpty()
* 2. 데이터 삽입 : enQueue(data) -> rear가 새 노드 가르키도록 하기
* 3. 데이터 삭제 : deQueue -> front가 새 노드 가르키도록 하기
* 4. print 메소드
*
* */

  public boolean isEmpty(){
    return front == null;
  }

  public void enQueue(T data){
    Node<T> newNode = new Node<>(data);
    if(isEmpty()){
      front = newNode;
      rear = newNode;
    }
    rear.next = newNode;
    rear = newNode;
    size++;
  }

  public T deQueue(){
    if(isEmpty()){
      System.out.println("queue 비었음");
      return null;
    }

    T data = front.data;

    //큐에 노드 하나만 있으면?
    if(front == rear){
      front = null;
      rear = null;
    }

    front = front.next;
    size--;
    return data;
  }

  public void printQueue(){
    if(isEmpty()){
      System.out.println("큐 비어있음");
    }
    Node<T> node = front;
    System.out.println(front.data);
    while (node.next != null){
      node = node.next;
      System.out.println(node.data);
    }
  }

}
