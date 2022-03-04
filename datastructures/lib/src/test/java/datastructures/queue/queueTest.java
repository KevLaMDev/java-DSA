package datastructures.queue;

import org.junit.jupiter.api.Test;

public class queueTest {
    @Test
    public void enqueueTest() {
        Queue sut = new Queue();
        sut.enqueue(1);
        assert(sut.front.value == 1);
    }
    @Test
    public void enqueueMultipleTest() {
        Queue sut = new Queue();
        sut.enqueue(1);
        sut.enqueue(2);
        sut.enqueue(3);
        assert(sut.rear.value == 3 && sut.front.value == 1);
    }
    @Test
    public void dequeueTest() {
        Queue sut = new Queue();
        sut.enqueue(1);
        sut.enqueue(2);
        assert(sut.dequeue() == 1);
    }
    @Test
    public void testPeek() {
        Queue sut = new Queue();
        sut.enqueue(17);
        sut.enqueue(9);
        assert(sut.peek() == 17);
    }
    @Test
    public void testMultipleDequeues() {
        Queue sut = new Queue();
        sut.enqueue(17);
        sut.enqueue(9);
        sut.enqueue(11);
        sut.dequeue();
        sut.dequeue();
        sut.dequeue();
        assert(sut.front == null);
    }
    @Test
    public void emptyQueueTest() {
        Queue sut = new Queue();
        assert(sut.front == null);
    }
    @Test
    public void dequeuePeekOnEmptyQueueTest() {
        Queue sut = new Queue();
        assert(sut.dequeue() == null && sut.peek() == null);
    }
}
