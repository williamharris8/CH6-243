import java.util.Iterator;
import java.util.Comparator;

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

        Comparator<Song> byTitle = (a, b) -> a.title.compareTo(b.title);
        Comparator<Song> byArtist = (a, b) -> a.artist.compareTo(b.artist);

        SortedLinkedList titleList = new SortedLinkedList(byTitle);
        SortedLinkedList artistList = new SortedLinkedList(byArtist);

        Song[] songs = {
                new Song("Time", "Pink Floyd", 422),
                new Song("Zombie", "The Cranberries", 308),
                new Song("Out There", "Dinosaur Jr.", 353),
                new Song("Free Bird", "Lynyrd Skynyrd", 547),
                new Song("Fade Into You", "Mazzy Star", 295)
        };

        for (Song s : songs) {
            titleList.add(0, s);
            artistList.add(0, s);
        }

        System.out.println(" Sorted by title ");
        titleList.display();

        System.out.println(" Sorted by artist ");
        artistList.display();

        System.out.println(" Edge case tests ");

        playlist.addLast(new Song("Black Hole Sun", "Soundgarden", 318));
        System.out.println(" After adding to end (tail check) ");
        playlist.display();

        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add(0, new Song("Linger", "The Cranberries", 274));
        testList.addLast(new Song("Dreams", "Fleetwood Mac", 257));
        testList.addLast(new Song("Creep", "Radiohead", 239));
        System.out.println(" Started from empty list ");
        testList.display();

        Iterator<Song> it2 = testList.iterator();
        it2.next();
        it2.remove();
        System.out.println(" After removing first song ");
        testList.display();
    }

}

