# Hashmaps
This implementation of a hashmap data structure uses an arraylist to act as the 'map'. Each index of the array list contains a nested linked list of hashmap pair objects (a subclass of the abstract class, 'abstractMap.simpleEntry').
The hashmap allows O(1) look up, creation and deletion, barring collisions.

## Challenge
Implement a Hashtable Class with the following methods:
- set
  - Arguments: key, value
  - Returns: nothing
  - This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
    Should a given key already exist, replace its value from the value argument given to this method.
- get
  - Arguments: key
  - Returns: Value associated with that key in the table
- contains
  - Arguments: key
  - Returns: Boolean, indicating if the key exists in the table already.
- keys
  - Returns: Collection of keys
- hash
  - Arguments: key
  - Returns: Index in the collection for that key
  
## Approach & Efficiency
- By using a hash function, we can achieve O(1) look up, insertion and deletion
- When determining whether the hashmap contains a given key, the key is hashed and the arraylist is accessed at the index of the hashed key output. By doing so we have O(1) lookup best case and O(n) worst case.
- The list method is O(n^2), due to the fact that the entire hashmap structure must be iterated over in order to generate a list of all keys.

## API
- set: This method sets a new key value pair in the hashmap. Time complexity is O(1) if the key does not already exist with in the hashmap, and if it does time complexity is O(n) as we must traverse the linked list to find the key and replace its value with the new input value.
- get: This method gets the value of a given key in the hashmap.Time complexity is O(1) if there are no collisions, otherwise it is O(n)
- contains: This method returns a boolean if a given key is present in the hashmap. Time complexity is O(n), as we are able to directly access the arraylist index where the linked list is located via the hashed key. We then still must iterate over the linkedList however, leading to O(n)
- list: This method returns a list of all the keys present in the hashmap. Due to the use of nested for loops to iterate over the entirety of the hashmap, time complexity is O(n^2)
- hash: This method returns an int hash value from the input key.