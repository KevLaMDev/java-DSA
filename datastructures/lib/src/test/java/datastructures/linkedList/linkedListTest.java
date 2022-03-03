package datastructures.linkedList;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import org.checkerframework.framework.qual.LiteralKind;
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
        sut.insert(2);
        sut.insert(3);
        assert(sut.includes(1));
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
    @Test
    public void testAppend() {
        LinkedList sut = new LinkedList();
        sut.insert(8);
        sut.append(9);
//        assert(sut.tail.value == 9);
    }
    @Test
    public void testInsertBefore() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(9);
        sut.insertBefore(11, 10);
        int[] testArr = {9, 10 ,11};
        int index = 2;
        int[] nodeValuesArr = new int[3];
        Node currentNode = sut.head;
        while(currentNode != null) {
            System.out.println(index);
            nodeValuesArr[index] = currentNode.value;
            currentNode = currentNode.next;
            index--;
        }
        System.out.println(Arrays.toString(nodeValuesArr));
        assert(Arrays.equals(nodeValuesArr, testArr));
    }
    @Test
    public void testKthFromEnd() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(12);
        sut.insert(13);
        sut.insert(15);
        assert(sut.kthFromEnd(2) == 13);
    }
    @Test
    public void testKthFromEndKoutOfBounds() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(12);
        sut.insert(13);
        sut.insert(15);
        assert(sut.kthFromEnd(5) == -1);
    }
    @Test
    public void testKthFromEndKequalsSize() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(12);
        sut.insert(13);
        sut.insert(15);
        assert(sut.kthFromEnd(4) == -1);
    }
    @Test
    public void testKthFromEndKisNegative() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(12);
        sut.insert(13);
        sut.insert(15);
        assert(sut.kthFromEnd(-10) == -1);
    }
    @Test
    public void testKthFromEndListSizeIs1() {
        LinkedList sut = new LinkedList();
        sut.insert(1);
        assert(sut.kthFromEnd(0) == 1);
    }
    @Test
    public void testKthFromEndHappyPath() {
        LinkedList sut = new LinkedList();
        sut.insert(11);
        sut.insert(12);
        sut.insert(13);
        sut.insert(14);
        sut.insert(15);
        assert(sut.kthFromEnd(2) == 13);
    }
    @Test
    public void zippedLinkedList() {
        LinkedList sut1 = new LinkedList();
        LinkedList sut2 = new LinkedList();
        LinkedList sut3 = new LinkedList();
        sut1.insert(5);
        sut1.insert(3);
        sut1.insert(1);
        sut2.insert(6);
        sut2.insert(4);
        sut2.insert(2);
        LinkedList zippedLists = sut3.zipLists(sut1, sut2);
        assert(zippedLists.toString().equals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> NULL"));
    }

}
