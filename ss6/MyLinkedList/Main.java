package ss6.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        myLinkedList.addFist(10);
        myLinkedList.addFist(20);
        myLinkedList.addFist(30);
        myLinkedList.addFist(40);
        myLinkedList.addFist(50);
        myLinkedList.addFist(60);

        System.out.println(myLinkedList);
    }
}
