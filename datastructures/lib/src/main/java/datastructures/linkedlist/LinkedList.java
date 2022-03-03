package datastructures.linkedlist;


import javax.sound.sampled.Line;
import java.awt.geom.Line2D;

public class LinkedList
{
    public Node head = null;
    public int size = 0;

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
            if (currentNode.value == value) return true; //TODO change this to .equals when using T
            currentNode = currentNode.next;
        }
        return false;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = null;
        }
        else {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    newNode.next = null;
                    break;
                } else currentNode = currentNode.next;
            }
        }
    }
    public void insertBefore(int value, int newVal) {
        Node newNode = new Node(newVal);
        Node currentNode = head;
        Node temp;
        if (currentNode != null) {
            while (currentNode.next != null) {
                if (currentNode.next.value == value) {
                    temp = currentNode.next;
                    currentNode.next = newNode;
                    newNode.next = temp;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
    }

    public void insertAfter(int value, int newVal) {
        Node newNode = new Node(newVal);
        Node currentNode = head;
        Node temp;
        while(currentNode != null) {
            if (currentNode.value == value) {
                temp = currentNode.next;
                currentNode.next = newNode;
                newNode.next = temp;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public Integer kthFromEnd(int k) {
        if (k < 0) return null;
        Node currentNode = head;
        if (currentNode == null) return null;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        if (k > size) return null;
        int targetNode = size - k;
        size = 0;
        currentNode = head;
        while(currentNode != null){
            size++;
            if (size == targetNode) return currentNode.value;
            currentNode = currentNode.next;
        }
        return null;
    }

    public LinkedList zipLists(LinkedList linkedList1, LinkedList linkedList2) {
        Node currentNode1 = linkedList1.head;
        Node currentNode2 = linkedList2.head;
        LinkedList zippedLinkedList = new LinkedList();
        while (currentNode1 != null || currentNode2 != null) {
            if (currentNode1 != null) {
                zippedLinkedList.append(currentNode1.value);
                currentNode1 = currentNode1.next;
            }
            if (currentNode2 != null) {
                zippedLinkedList.append(currentNode2.value);
                currentNode2 = currentNode2.next;
            }
        }
        return zippedLinkedList;
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

}
