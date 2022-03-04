package datastructures.stack;

public class Stack {
    Node top = null;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public void push() {
        //empty node
    }

    public Integer pop() {
        if (top == null) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp.value;
    }

    public Integer peek() {
        if (top != null) {
            return top.value;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return (top != null);
    }

}
