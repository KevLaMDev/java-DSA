package datastructures.binaryTree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class binaryTreeTest {
    @Test
    void emptyBinaryTreeTest() {
        BinaryTree bt = new BinaryTree();
        assert(bt.root == null);
    }

    @Test
    void bstTestChildNodeTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(2);
        bst.add(11);
        boolean root = bst.root.value == 10;
        boolean leftChild = bst.root.leftChild.value == 2;
        boolean rightChild = bst.root.rightChild.value == 11;
        assert(root && leftChild && rightChild);
    }
    @Test
    void preOrderTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(4);
        bst.add(6);
        Object[] testArr = {5, 4, 6};
        assert(Arrays.equals(bst.preOrder(), testArr));
    }
    @Test
    void inOrderTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(4);
        bst.add(3);
        bst.add(5);
        bst.add(9);
        bst.add(7);
        bst.add(10);
        Object[] testArr = {3, 4, 5, 6, 7, 9, 10};
        assert(Arrays.equals(bst.inOrder(), testArr));
        /*
            6
          4     9
        3   5  7  10
         */
    }
    @Test
    void postOrderTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(4);
        bst.add(3);
        bst.add(5);
        bst.add(9);
        bst.add(7);
        bst.add(10);
        Object[] testArr = {3, 5, 4, 7, 10, 9, 6};
        assert(Arrays.equals(bst.postOrder(), testArr));
    }
    @Test
    void bstContainsTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(4);
        bst.add(3);
        bst.add(5);
        bst.add(9);
        bst.add(7);
        bst.add(10);
        assert(bst.bstContains(7));
    }
    @Test
    void bstContainsFalseTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(4);
        bst.add(3);
        bst.add(5);
        bst.add(9);
        bst.add(7);
        bst.add(10);
        assert(bst.bstContains(11) == false);
    }
    @Test
    void findMaxTest() {
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(1);
        bt.add(2);
        bt.add(6);
        bt.add(5);
        assert(bt.findMaxValue() == 6);
    }

}
