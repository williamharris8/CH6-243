import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();
        playlist.addLast(new Song("Out There", "Dinosaur Jr.", 353));
        playlist.addLast(new Song("Fade Into You", "Mazzy Star", 295));
        playlist.addLast(new Song("Free Bird", "Lynyrd Skynyrd", 547));
        playlist.display();

        playlist.add(1, new Song("Time", "Pink Floyd", 422));
        playlist.add(0, new Song("Zombie", "The Cranberries", 308));
        System.out.println(" After inserting ");
        playlist.display();

        System.out.println(" Song at position 2: " + playlist.get(2));

        try {
            playlist.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Caught error: " + e.getMessage());
        }

        System.out.println(" For each loop ");
        for (Song s : playlist) {
            System.out.println(s);
        }

        Iterator<Song> it = playlist.iterator();
        while (it.hasNext()) {
            Song s = it.next();
            if (s.title.equals("Free Bird")) {
                it.remove();
            }
        }

        System.out.println(" After removing Free Bird ");
        playlist.display();
    }

}

