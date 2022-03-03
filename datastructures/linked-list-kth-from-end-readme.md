# k-th value from the end of a linked list.

Write the following method for the Linked List class:
- kth from end
- argument: a number, k, as a parameter.
- Return the node’s value that is k places from the tail of the linked list.
- You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Whiteboard Process
![image](/datastructures/code-challenge-7.png)

## Approach and Efficiency
The time complexity of this algorithm is o(n) 2x as I traverse the linked list twice: once to ascertain its length, and another time to retrieve the target node value

## Solution
```java  public Integer kthFromEnd(int k) {
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
    }```