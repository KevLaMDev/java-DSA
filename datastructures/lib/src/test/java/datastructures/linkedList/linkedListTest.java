package datastructures.linkedList;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class linkedListTest {
    @Test
    public void emptyLinkedListTest()
    {
        LinkedList sut = new LinkedList();
        assert(sut.head == null);
    }
    @Test
    public void insertTest() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        assert(sut.includes(5));
    }
    @Test
    public void testNewHead() {
        LinkedList sut = new LinkedList();
        sut.insert(33);
        assert(sut.head.value == 33);
    }
    @Test
    public void testMultipleInserts() {
        LinkedList sut = new LinkedList();
        sut.insert(-1);
        sut.insert(9);
        assert(sut.head.value == 9);
    }
    @Test
    public void testIncludesMultipleInserts() {
        LinkedList sut = new LinkedList();
        sut.insert(1);
        sut.insert();
        sut.insert(3);
        assert(sut.includes(1) && sut.includes(3));
    }
    @Test
    public void testDoesNotIncludeInserts() {
        LinkedList sut = new LinkedList();
        sut.insert(1);
        assert(!sut.includes(0));
    }
    @Test
    public void testCollection() {
        LinkedList sut = new LinkedList();
        int[] testArr = {1, 2, 3, 4, 5};
        for (int el : testArr) {
            sut.insert(el);
        }
        int index = testArr.length-1;
        int[] nodeValuesArr = new int[testArr.length];
        Node currentNode = sut.head;
        while(currentNode != null) {
            nodeValuesArr[index] = currentNode.value;
            currentNode = currentNode.next;
            index--;
        }
        assert(Arrays.equals(nodeValuesArr, testArr));
    }
}
