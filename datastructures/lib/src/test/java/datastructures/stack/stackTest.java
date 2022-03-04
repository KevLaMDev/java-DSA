package datastructures.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class stackTest {
    @Test
    public void stackPushTest() {
        Stack sut = new Stack();
        sut.push(5);
        assert(sut.top.value == 5);
    }
    @Test
    public void stackMultipleTest() {
        Stack sut = new Stack();
        sut.push(5);
        sut.push(4);
        sut.push(3);
        Node currentNode = sut.top;
        int[] testArr = new int[3];
        int[] controlArr = {3, 4, 5};
        int index = 0;
        while(currentNode != null) {
            testArr[index] = currentNode.value;
            index++;
            currentNode = currentNode.next;
        }
        assert(Arrays.equals(testArr, controlArr));
    }
    @Test
    public void popTest() {
        Stack sut = new Stack();
        sut.push(3);
        sut.push(44);
        sut.pop();
        assert(sut.top.value == 3);
    }
    @Test
    public void popAllTest() {
        Stack sut = new Stack();
        sut.push(3);
        sut.push(44);
        sut.pop();
        sut.pop();
        assert(sut.top == null);
    }
    @Test
    public void peekTest() {
        Stack sut = new Stack();
        sut.push(3);
        sut.push(44);
        assert(sut.peek() == 44);
    }
    @Test
    public void emptyStackTest() {
        Stack sut = new Stack();
        assert(sut.top == null);
    }
    @Test
    public void emptyStackPopPeekTest() {
        Stack sut = new Stack();
        assert(sut.peek() == null && sut.pop() == null);
    }

}
