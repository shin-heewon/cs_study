package linkedList;

public class SingleLinkedListEx {

  public static void main(String[] args) {

    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();

    for (int i = 0; i < 10; i++) {
      mylist.insert(i,i+1);
    }
    mylist.printAll();
    System.out.println("====================");

    mylist.delete(9);
    mylist.printAll();
    System.out.println("====================");
    System.out.println(mylist.tail.data);


  }




}
