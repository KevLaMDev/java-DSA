package codechallenges;

public class Queue {
    public Node front = null;
    public Node rear = null;

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            newNode = rear.next;
            rear = newNode;
        }
    }

    public String dequeue() {
        if (front != null) {
            Node temp = front;
            front = front.next;
            temp.next = null;
            return temp.value;
        }
        return null;
    }
}
