public class SinglyLinkedList {

    protected class Node {
        Song data;
        Node next;

        Node(Song data) {
            this.data = data;
        }
    }

    protected Node head;
    protected Node tail;

    public void addLast(Song song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
