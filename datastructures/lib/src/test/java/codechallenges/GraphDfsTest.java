package codechallenges;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphDfsTest {
    @Test
    void dfsTest() {
        Graph sut = new Graph(8);
        Vertex<Integer> v1 = sut.addVertex(1);
        Vertex<Integer> v2 = sut.addVertex(2);
        Vertex<Integer> v3 = sut.addVertex(3);
        Vertex<Integer> v4 = sut.addVertex(4);
        sut.addEdge(v1, v2);
        sut.addEdge(v2, v3);
        sut.addEdge(v2, v4);
        ArrayList<Integer> control = new ArrayList<>();
        control.add(1);
        control.add(2);
        control.add(4);
        control.add(3);
        assert(control.equals(sut.DFSpreorder(v1)));
    }
    /*
        1
      /
     2
   /  \
  3    4

     */
    @Test
    void dfsTest2() {
        Graph sut = new Graph(8);
        Vertex<String> v1 = sut.addVertex("A");
        Vertex<String> v2 = sut.addVertex("B");
        Vertex<String> v3 = sut.addVertex("C");
        Vertex<String> v4 = sut.addVertex("D");
        Vertex<String> v5 = sut.addVertex("E");
        sut.addEdge(v1, v2);
        sut.addEdge(v1, v3);
        sut.addEdge(v3, v4);
        sut.addEdge(v4, v5);
        String[] control = {"A", "C", "D", "E", "B"};
        assert(Arrays.asList(control).equals(sut.DFSpreorder(v1)));
    }
    /*
        A
      /  \
     B    C
         / \
        D   E

     */
}
