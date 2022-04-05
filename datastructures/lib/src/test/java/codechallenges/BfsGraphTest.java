package codechallenges;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

public class BfsGraphTest {
    @Test
    void bfsGraphTest() {
        Graph sut = new Graph(4);
        Vertex vA = sut.addVertex("A");
        Vertex vB = sut.addVertex("B");
        Vertex vC = sut.addVertex("C");
        Vertex vD = sut.addVertex("D");
        sut.addEdge(vA, vB);
        sut.addEdge(vA, vC);
        sut.addEdge(vB, vD);
        System.out.println(sut.BFSgraph(vA));
    }
    @Test
    void bfsGraphMultipleSame() {
        Graph sut = new Graph(4);
        Vertex vA = sut.addVertex("A");
        Vertex vB = sut.addVertex("B");
        Vertex vC = sut.addVertex("C");
        Vertex vD = sut.addVertex("D");
        sut.addEdge(vA, vB);
        sut.addEdge(vA, vC);
        sut.addEdge(vB, vC);
        sut.addEdge(vB, vA);
        sut.addEdge(vC, vB);
        System.out.println(sut.BFSgraph(vA));
    }
}
