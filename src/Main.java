public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();
        playlist.addLast(new Song("Out There", "Dinosaur Jr.", 353));
        playlist.addLast(new Song("Fade Into You", "Mazzy Star", 295));
        playlist.addLast(new Song("Free Bird", "Lynyrd Skynyrd", 547));
        playlist.display();
    }
}
