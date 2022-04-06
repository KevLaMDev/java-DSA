package codechallenges;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

public class BusinessTripTest {
    @Test
    void businessTripTest() {
        Graph graph = new Graph(4);
        Vertex v1 = graph.addVertex("A");
        Vertex v2 = graph.addVertex("B");
        graph.addEdge(v1, v2);
        graph.addEdge(v2, v1);
        BusinessTrip sut = new BusinessTrip();
        String[] control = {"A", "B"};
        System.out.println(sut.businessTrip(graph, control));
    }
}
