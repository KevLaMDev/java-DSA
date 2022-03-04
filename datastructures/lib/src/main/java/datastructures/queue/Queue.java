package datastructures.queue;

public class Queue {
    Node rear = null;
    Node front = null;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Integer peek() {
        if (front == null) return null;
        return front.value;
    }

    public Integer dequeue() {
        if (front == null) return null;
        Node temp = front;
        front = front.next;
        return temp.value;
    }

    public boolean isEmpty() {
        return (front == null);
    }
}
