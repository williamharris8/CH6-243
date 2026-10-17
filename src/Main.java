import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();
        playlist.addLast(new Song("Out There", "Dinosaur Jr.", 353));
        playlist.addLast(new Song("Fade Into You", "Mazzy Star", 295));
        playlist.addLast(new Song("Free Bird", "Lynyrd Skynyrd", 547));
        playlist.display();

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
