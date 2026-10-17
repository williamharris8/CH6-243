import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList implements Iterable<Song> {

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

    public Iterator<Song> iterator() {
        return new Iterator<Song>() {
            Node prev = null;
            Node lastReturned = null;
            Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Song next() {
                if (current == null) {
                    throw new NoSuchElementException();
                }
                if (lastReturned != null) {
                    prev = lastReturned;
                }
                lastReturned = current;
                current = current.next;
                return lastReturned.data;
            }

            public void remove() {
                if (lastReturned == null) {
                    throw new IllegalStateException();
                }
                if (prev == null) {
                    head = lastReturned.next;
                } else {
                    prev.next = lastReturned.next;
                }
                if (lastReturned == tail) {
                    tail = prev;
                }
                lastReturned = null;
            }
        };
    }
}
