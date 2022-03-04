package codechallenges;

import datastructures.stack.Node;
import datastructures.stack.Stack;

public class PseudoQueue {
    Stack LIFO = new Stack();
    Stack FIFO = new Stack();

    public void enqueue(int value) {
        LIFO.push(value);
        Node currentNode = LIFO.top;
        while(currentNode != null) {
            FIFO.push(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public Integer dequeue() {
        if (FIFO.top != null) return null;
        return FIFO.pop();
    }

}
