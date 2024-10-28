package linkedList;

public class SingleLinkedListEx {

  public static void main(String[] args) {

    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();

    for (int i = 0; i < 10; i++) {
      mylist.insert(i,i+1);
    }
    mylist.printAll();
    System.out.println("====================");

    mylist.insert(3, 777);
    mylist.printAll();

    System.out.println("======================");


    mylist.delete(10);
    mylist.printAll();
    System.out.println("====================");
    System.out.println("첫번째에 삽입");
    mylist.addFirst(100);
    mylist.printAll();


  }




}
