package datastructures.linkedlist;

public class LinkedList
{
    public Node head = null;
    public Node tail = null;

    public void insert(int value) {
        Node newHead = new Node(value);
        // set next pointer to current head
        newHead.next = head;
        // set newHeadNode as Head node
        head = newHead;
    }

    public void insert() {
        Node newHead = new Node();
        newHead.next = head;
        head = newHead;
    }

    public boolean includes(int value) {
        Node currentNode = head;
        // currentNode itself is assigned its position as head
        while(currentNode != null) {
            // check the VALUE of the Node, not the Node itself
            if (currentNode.value == value) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node currentNode = head;
        String printOut = "";
        while (currentNode != null) {
            printOut += "{ " + currentNode.value + " } -> ";
            currentNode = currentNode.next;
        }
        printOut += "NULL";
        return printOut;
    }
    // return concat string of Node values
        // while (node != null)
            // if node.next == null String += { node.value } -> NULL
            // else String += { node.value } ->
}
