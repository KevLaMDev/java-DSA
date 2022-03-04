# Stacks and Queues

## Challenge
Stack
- Create a Stack class that has a top property. It creates an empty Stack when instantiated.
- This object should be aware of a default empty value assigned to top when the stack is created.
  - The class should contain the following methods:
    - push
      - Arguments: value
      - adds a new node with that value to the top of the stack with an O(1) Time performance.
    - pop
      - Arguments: none
      - Returns: the value from node from the top of the stack
      - Removes the node from the top of the stack
      - Should raise exception when called on empty stack
    - peek
      - Arguments: none
      - Returns: Value of the node located at the top of the stack
      - Should raise exception when called on empty stack
        is empty
      - Arguments: none
      - Returns: Boolean indicating whether or not the stack is empty.
    - Queue
      - Create a Queue class that has a front property. It creates an empty Queue when instantiated.
      - This object should be aware of a default empty value assigned to front when the queue is created.
      - The class should contain the following methods:
    - enqueue
      - Arguments: value
      - adds a new node with that value to the back of the queue with an O(1) Time performance.
    - dequeue
      - Arguments: none
      - Returns: the value from node from the front of the queue
      - Removes the node from the front of the queue
      - Should raise exception when called on empty queue
    - peek
      - Arguments: none
      - Returns: Value of the node located at the front of the queue
      - Should raise exception when called on empty stack
        is empty
      - Arguments: none
      - Returns: Boolean indicating whether or not the queue is empty
      - You have access to the Node class and all the properties on the Linked List class.

## Approach and Efficacy
Stack:
```java public class Stack {
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
```

Queue: 
```java public class Queue {
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
```

## API
Stack class methods:
- push: takes an int value and adds a new node to the top of the stack with O(1)
- pop: takes no args and returns the value of the top node, and then removes it from the stack.
- peek: takes no args, returns the value of the top node
- isEmpty: takes no args, returns a boolean indicating if the queue is empty or not
Queue class methods:
- enqueue: takes an int value as arg and adds a new node with that value to the bak of the queue with O(1)
- dequeue: takes no args, returns the value from node at the front of the queue
- peek: takes no args, returns the value of the front node
- isEmpty: takes no args, returns a boolean indicating if the queue is empty.