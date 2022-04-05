package datastructures.graphs;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {
    @Test
    void addVertexTest() {
        Graph sut = new Graph<>(4);
        sut.addVertex("b");
        assert(sut.getListOfVerticeNames().contains("b"));
    }
    @Test
    void addEdgeTest() {
        Graph sut = new Graph<>(4);
        Vertex vertexA = sut.addVertex("a");
        Vertex vertexB = sut.addVertex("b");
        sut.addEdge(vertexA, vertexB);
        System.out.println(sut.getNeighbors(vertexA));
    }
    @Test
    void testGetVertices() {
        Graph sut = new Graph<>(4);
        sut.addVertex("a");
        sut.addVertex("b");
        System.out.println(sut.getVertices());
    }
    @Test
    void testGetNeighbors() {
        Graph sut = new Graph<>(4);
        Vertex vertexA = sut.addVertex("a");
        Vertex vertexB = sut.addVertex("b");
        sut.addEdge(vertexA, vertexB);
        System.out.println(sut.getNeighbors(vertexA));
    }
    @Test
    void testGetNeighborsWithWeight() {
        Graph sut = new Graph<>(4);
        Vertex vertexA = sut.addVertex("a");
        Vertex vertexB = sut.addVertex("b");
        sut.addEdge(vertexA, vertexB, 1);
        System.out.println(sut.getNeighbors(vertexA));
    }
    @Test
    void testGetSizeOfGraph() {
        Graph sut = new Graph<>(4);
        sut.addVertex("a");
        sut.addVertex("b");
        assert(sut.size() == 2);
    }
    @Test
    void nullTest() {
        Graph sut = new Graph<>();
        assertEquals(sut.toString(), "");
    }
}
