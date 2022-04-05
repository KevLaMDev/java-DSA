# Singly Linked List

## Challenge: 
Create a Linked List class. Within your Linked List class, include a head property. Upon instantiation, an empty Linked List should be created.
The class should contain the following methods:
- insert
- Arguments: value
- Returns: nothing
- Adds a new node with that value to the head of the list with an O(1) Time performance.
- includes
- Arguments: value
- Returns: Boolean
- Indicates whether that value exists as a Node’s value somewhere within the list.
to string
- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"
## Approach and Efficiency
Inserting into the linked list is O(1) because we can add to it without traversing the list.
If inserting at specific node, O(n) is the result

## API
public void insert(int value) Insert takes an int arg and adds a node containing the int val to the linked list

public boolean includes(int value) Includes takes an int arg and returns a boolean if the linked list contains the value

public String toString() toString overrides the parent toString method and returns a string showing the nodes and elements with the linked list.