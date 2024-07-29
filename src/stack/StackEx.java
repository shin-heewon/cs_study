package stack;

public class StackEx {

  public static void main(String[] args) {

    Stack<Integer> myStack = new Stack<>();

    for(int i=1; i<11; i++){
      myStack.push(i);
    }

    myStack.printAll();

    System.out.println("======================");

    myStack.pop();
    myStack.printAll();

    System.out.println("======================");

    myStack.pop();
    myStack.printAll();


  }


}
