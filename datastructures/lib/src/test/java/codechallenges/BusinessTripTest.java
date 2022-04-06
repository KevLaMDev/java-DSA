package codechallenges;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

public class BusinessTripTest {
    @Test
    void businessTripTestShouldReturn8() {
        Graph graph = new Graph(4);
        Vertex v1 = graph.addVertex("A");
        Vertex v2 = graph.addVertex("B");
        graph.addEdge(v1, v2, 8);
        graph.addEdge(v2, v1);
        BusinessTrip sut = new BusinessTrip();
        String[] control = {"A", "B"};
        System.out.println(sut.businessTrip(graph, control));
    }
    @Test
    void businessTripTestShouldReturnNull() {
        Graph graph = new Graph(6);
        Vertex v1 = graph.addVertex("A");
        Vertex v2 = graph.addVertex("B");
        Vertex v3 = graph.addVertex("C");
        graph.addEdge(v1, v2);
        String[] control = {"A", "C"};
        BusinessTrip sut = new BusinessTrip();
        assert(sut.businessTrip(graph, control) == null);
    }
    @Test
    void businessTripShouldReturn3() {
        Graph graph = new Graph(4);
        Vertex v1 = graph.addVertex("A");
        Vertex v2 = graph.addVertex("B");
        Vertex v3 = graph.addVertex("C");
        graph.addEdge(v1, v2, 1);
        graph.addEdge(v2, v3, 2);
        String[] control = {"A", "B", "C"};
        BusinessTrip sut = new BusinessTrip();
        assert(sut.businessTrip(graph, control).equals(3));
    }
}
