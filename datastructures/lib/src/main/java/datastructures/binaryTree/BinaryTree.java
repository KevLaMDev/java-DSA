package datastructures.binaryTree;

import java.util.ArrayList;

public class BinaryTree {
    Node root = null;
    ArrayList<Integer> nodeValueArrayList;

    public Object[] preOrder() {
        Node currentNode = root;
        if (currentNode == null) return null;
        nodeValueArrayList = new ArrayList<>();
        preOrderRecursiveAuxiliary(currentNode);
        return nodeValueArrayList.toArray();
    }

    public void preOrderRecursiveAuxiliary(Node currentNode) {
        nodeValueArrayList.add(currentNode.value);
        if (currentNode.leftChild != null) preOrderRecursiveAuxiliary(currentNode.leftChild);
        if (currentNode.rightChild != null) preOrderRecursiveAuxiliary(currentNode.rightChild);
    }

    public Object[] postOrder() {
        Node currentNode = root;
        if (currentNode == null) return null;
        nodeValueArrayList = new ArrayList<>();
        postOrderRecursiveAuxiliary(currentNode);
        return nodeValueArrayList.toArray();
    }

    public void postOrderRecursiveAuxiliary(Node currentNode) {
        if (currentNode.leftChild != null) postOrderRecursiveAuxiliary(currentNode.leftChild);
        if (currentNode.rightChild != null) postOrderRecursiveAuxiliary(currentNode.rightChild);
        nodeValueArrayList.add(currentNode.value);
    }

    public Object[] inOrder() {
        Node currentNode = root;
        if (currentNode == null) return null;
        nodeValueArrayList = new ArrayList<>();
        inOrderRecursiveAuxiliary(currentNode);
        return nodeValueArrayList.toArray();
    }

    public void inOrderRecursiveAuxiliary(Node currentNode) {
        if (currentNode.leftChild != null) inOrderRecursiveAuxiliary(currentNode.leftChild);
        nodeValueArrayList.add(currentNode.value);
        if (currentNode.rightChild != null) inOrderRecursiveAuxiliary(currentNode.rightChild);
    }


}
