# Graphs
A graph data structure consists of a finite (and possibly mutable) set of vertices (also called nodes or points), together with a set of unordered pairs of these vertices for an undirected graph or a set of ordered pairs for a directed graph.

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
- add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph
- add edge
    - Arguments: 2 nodes to be connected by the edge, weight (optional)
    - Returns: nothing
    - Adds a new edge between two nodes in the graph
    - If specified, assign a weight to the edge
    - Both nodes should already be in the Graph
- get nodes
    - Arguments: none
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
- get neighbors
    - Arguments: node
    - Returns a collection of edges connected to the given node
    - Include the weight of the connection in the returned collection
- size
    - Arguments: none
    - Returns the total number of nodes in the graph
## Approach & Efficiency
The graph is consists of a Hashmap of Vertex keys and LinkedList values. The linked lists contain Edge objects which contain Vertex objects.
- Adding vertices/edges is O(1) time complexity. 
- Getting the neighbors of a specific vertex is O(1) look up via hashmap
- Getting a list of all vertices is O(n) as we must iterate over all the keys of the hashmap
## API
- add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph
- add edge
    - Arguments: 2 nodes to be connected by the edge, weight (optional)
    - Returns: nothing
    - Adds a new edge between two nodes in the graph
    - If specified, assign a weight to the edge
    - Both nodes should already be in the Graph
- get nodes
    - Arguments: none
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
- get neighbors
    - Arguments: node
    - Returns a collection of edges connected to the given node
    - Include the weight of the connection in the returned collection
- size
    - Arguments: none
    - Returns the total number of nodes in the graph