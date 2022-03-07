package datastructures.binaryTree;

public class BinarySearchTree extends BinaryTree{
    public BinarySearchTree() {
        //empty
    }

    public void add(int value) {
        Node newNode = new Node(value);
        Node currentNode = root;
        if (root == null) root = newNode;
        else addRecursiveAuxiliary(newNode, currentNode);
    }

    public void addRecursiveAuxiliary(Node newNode, Node currentNode) {
        if (newNode.value < currentNode.value) {
            if (currentNode.leftChild == null) {
                currentNode.leftChild = newNode;
            } else addRecursiveAuxiliary(newNode, currentNode.leftChild);

        } else if (newNode.value > currentNode.value) {
            if (currentNode.rightChild == null) {
                currentNode.rightChild = newNode;
            } else addRecursiveAuxiliary(newNode, currentNode.rightChild);
        }
    }

    public boolean bstContains(int value) {
        Node currentNode = root;
        if (currentNode == null) return false;
        if (currentNode.value == value) return true; // in the event that root is the only node and contains the value
        while (currentNode != null) {
            if (value < currentNode.value) currentNode = currentNode.leftChild;
            else if (value > currentNode.value) currentNode = currentNode.rightChild;
            else return true;
        }
        return false;
    }

}
