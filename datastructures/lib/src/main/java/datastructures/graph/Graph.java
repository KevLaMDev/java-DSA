 package datastructures.graph;

import datastructures.hashmap.HashMap;



import javax.sound.sampled.Line;
import java.beans.VetoableChangeListener;
import java.io.IOException;
import java.util.*;

 public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>> {
    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;
    private ArrayList<T> listOfVerticeNames = new ArrayList<>();
    private ArrayList<T> verticeValuesArr;
    private HashMap<Vertex<T>, Integer> visitedVerticesHashMap;

    public Graph() {

    }

    public Graph(int maxNumberOfVertices) {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(T value)
    {
        Vertex<T> vertexKey = new Vertex<>(value);
        LinkedList<Edge<T>> linkedListValue = new LinkedList<>();
        adjacencyLists.set(vertexKey, linkedListValue);
        numberOfVertices += 1;
        listOfVerticeNames.add(value);
        return vertexKey;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination) throws IllegalArgumentException
    {
        if (adjacencyLists.contains(start) && adjacencyLists.contains(destination)) {
            Edge<T> newEdge = new Edge<>(destination);
            adjacencyLists.get(start).addFirst(newEdge);
        } else {
            throw new IllegalArgumentException("Input vertices not valid");
        }
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) throws IllegalArgumentException
    {
        if (adjacencyLists.contains(start) && adjacencyLists.contains(destination)) {
            Edge<T> newEdge = new Edge<>(destination, weight);
            adjacencyLists.get(start).addFirst(newEdge);
        } else {
            throw new IllegalArgumentException("Input vertices not valid");
        }
    }

    public LinkedList<Vertex<T>> getVertices()  // getNodes()
    {
        LinkedList<Vertex<T>> linkedListOfVertices = new LinkedList<>();
        for (Vertex<T> key : adjacencyLists.keys()) {
            linkedListOfVertices.addFirst(key);
        }
        return linkedListOfVertices;
    }

    public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) throws IllegalArgumentException
    {
        if (adjacencyLists.contains(vertex)) {
            return adjacencyLists.get(vertex);
        } else {
            throw new IllegalArgumentException("Vertex does not exist in hash map");
        }
    }

    public int size()
    {
        return numberOfVertices;
    }

    public ArrayList<T> getListOfVerticeNames() {
        return listOfVerticeNames;
    }

    @Override
    public int compareTo(Graph<T> o)
    {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString()
    {
        return "";
    }

    public ArrayList<Vertex<T>> BFSgraph(Vertex<T> start) {
        ArrayList<Vertex<T>> result = new ArrayList<>();
        Deque<Vertex<T>> bfsQueue = new ArrayDeque<>();
        HashMap<Vertex<T>, Integer> visitedVertices = new HashMap<>(size() * 2);
        bfsQueue.addLast(start);
        Vertex<T> currentVertex = null;
        visitedVertices.set(start, 1);
        while(!bfsQueue.isEmpty()) {
            currentVertex = bfsQueue.removeFirst();
            result.add(currentVertex);
            for (Edge<T> neighbor : getNeighbors(currentVertex)) {
                if (!visitedVertices.contains(neighbor.destination)) {
                    visitedVertices.set(neighbor.destination, 1);
                    bfsQueue.addLast(neighbor.destination);
                }
            }
        }
        return result;
    }
    public LinkedList<Edge<T>> getNeighbors(T vertexValue) {
        List<Vertex<T>> listOfVertexKeys = getVertices();
        for (Vertex<T> currentVertex : listOfVertexKeys) {
            if (currentVertex.value.equals(vertexValue)) {
                return adjacencyLists.get(currentVertex);
            }
        }
        return null;

    }

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
}
