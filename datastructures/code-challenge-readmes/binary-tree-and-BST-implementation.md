# Trees
Trees are a data structure which utilize a 'tree' of linked nodes, starting from a singular 'root' node and branching out to child nodes.

## Challange
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a Binary Tree class
  - Define a method for each of the depth first traversals:
    - pre order
    - in order
    - post order which returns an array of the values, ordered appropriately.
  - Any exceptions or errors that come from your code should be semantic, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
- Create a Binary Search Tree class
  - This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
  - Add
    - Arguments: value
    - Return: nothing
    - Adds a new node with that value in the correct location in the binary search tree.
  - Contains
    - Argument: value
    - Returns: boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
Binary Tree is a class which entails the following:
- root node instance variable
- arraylist of node values within the tree
- Preorder, inorder and postorder functions which return an Object[] array converted from the instance's arraylist property. Each of these functions have a respective recursive auxiliary function which recurses through out the tree and adds the current node's value to the instance's arraylist property.
- The time complexity of preorder, inorder and postorder is O(n) as must traverse every node.

## API
- Preorder, inorder and postorder are public methods of the binary tree class.
  - These methods return an array of objects from a converted arraylist class instance property.
- The add method lives on the binary search tree class and adds a node following binary search tree protocol. The method employs an auxiliary recursive method which traverses over the tree to find the correct placement of the node within the tree. It takes no arguments and does not return anything, rather it modifies the arraylist instance property in place
- The bstContains method lives on the binary search tree class and takes an int value as an argument. The method employs a while loop instead of a recursive auxiliary method, and terminates when the current node is null. If the search value is greater than that of the current node, current node points to it's right child property. If the search value is less, current node points to its left child property.
