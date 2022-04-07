# Depth First Traversal
Depth First Search (DFS) algorithm traverses a graph in a depthward motion and uses a stack to remember to get the next vertex to start a search, when a dead end occurs in any iteration.

## Challenge
Write the following method for the Graph class:

- Name: Depth first
- Arguments: Node (Starting point of search)
- Return: A collection of nodes in their pre-order depth-first traversal order
- Program output: Display the collection

## Approach & Efficiency
The algorithm uses a hashmap and arraylist to keep track of which vertices have been visited in the graph and store the vertex values respectively. The algorithm also employs a recursive helper function to traverse the graph.
Time complexity of the algorithm is O(v) v being number of vertices.

## Solution
```
    public ArrayList<T> DFSpreorder(Vertex<T> start) {
        Vertex<T> currentVertex = start;
        if (currentVertex == null) return null;
        if (numberOfVertices == 0) return null;
        verticeValuesArr = new ArrayList<>();
        visitedVerticesHashMap = new HashMap<>(adjacencyLists.size);
        DFSTraverse(currentVertex);
        return verticeValuesArr;
    }

    public void DFSTraverse(Vertex<T> currentVertex) {
        visitedVerticesHashMap.set(currentVertex, 1);
        verticeValuesArr.add(currentVertex.value);
        LinkedList<Edge<T>> adjacencyList = getNeighbors(currentVertex);
        for (Edge<T> edge : adjacencyList) {
            if (!visitedVerticesHashMap.contains(edge.destination)) {
                DFSTraverse(edge.destination);
            }
        }
    }