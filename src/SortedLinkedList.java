import java.util.Comparator;

public class SortedLinkedList extends SinglyLinkedList {

    private Comparator<Song> comparator;

    public SortedLinkedList(Comparator<Song> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void add(int index, Song song) {
        Node newNode = new Node(song);

        if (head == null || comparator.compare(song, head.data) < 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            size++;
            return;
        }

        Node before = head;
        while (before.next != null && comparator.compare(song, before.next.data) >= 0) {
            before = before.next;
        }

        newNode.next = before.next;
        before.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
    }
}