package linkedList;

public class Node <T>{
  T data;// T타입의 데이터 공간 선언
  Node<T> next;


  public Node(T data){
    this.data = data;
  }
}
