package doubleLinkedList;

public class DoubleLinkedListEx {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        for(int i=1; i<11; i++){
            list.insert(i, i-1, "next");
        }

        list.printAll();
        System.out.println("====================");

        list.delete(5);
        list.printAll();
        System.out.println("====================");

        list.addLast(55);
        list.printAll();

        System.out.println("=========================");
        Node node = list.search(8);
        System.out.println(node.data);
    }

}
