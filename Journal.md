PHASE 1 - For this had me make a Song class and a linked list that stores songs in a chain of nodes. Then add a method for putting songs at the end and a method to print followed by three test songs. Linked lists keep each item in a separate node pointing to the next following the links from the start. An array though keeps items side by side in one fixed block.

PHASE 2 - Unlinking a node means making the chain skip over it. When remove() is called the node before the removed song gets its next changed to point to the song after. The iterator doesnt lose its place because it keeps a separate pointer called current that points to next song.

PHASE 3 - Inserting in teh middle of a linked list is O(n) since you walk from head to spot. In the middle of an array is also O(n) since everything after the spot shifts over. The array is more expensive because it has to move items while linked list just changes two links.

PHASE 4 - A separate SortedLinkedList picks its sorting rule when it's made so every song added goes into the right spot automatically. Since the Comparator is passed in, the same class can sort by title, artist or other without code change. Tested this by sorting with title and also artist.

PHASE 5 - I tested adding to an empty list, removing the first and last songs, and inserting at index 0 and everythign worked. The bug I ran into was forgetting to update size in addLast and remove() so add() thought the list was empty and threw an IndexOutOfBoundsException. 