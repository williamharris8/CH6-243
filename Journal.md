PHASE 1 - For this had me make a Song class and a linked list that stores songs in a chain of nodes. Then add a method for putting songs at the end and a method to print followed by three test songs. Linked lists keep each item in a separate node pointing to the next following the links from the start. An array though keeps items side by side in one fixed block.

PHASE 2 - Unlinking a node means making the chain skip over it. When remove() is called the node before the removed song gets its next changed to point to the song after. The iterator doesnt lose its place because it keeps a separate pointer called current that points to next song.

PHASE 3 - Inserting in teh middle of a linked list is O(n) since you walk from head to spot. In the middle of an array is also O(n) since everything after the spot shifts over. The array is more expensive because it has to move items while linked list just changes two links.
