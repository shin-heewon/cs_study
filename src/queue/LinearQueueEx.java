package queue;

public class LinearQueueEx {

  public static void main(String[] args) {

    LinearQueue<Integer> myQ = new LinearQueue<>();

    for(int i=1; i<11; i++){
      myQ.enQueue(i);
    }

    myQ.printQueue();

    System.out.println("======================");

    myQ.deQueue();
    myQ.printQueue();

    System.out.println("======================");

    myQ.deQueue();
    myQ.printQueue();


  }


}
