package ss6.MyLinkedList;

public class MyLinkedList<T> {
    private class Node<T> {
        T value;
        Node next; //null

        public Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public void addFist(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
