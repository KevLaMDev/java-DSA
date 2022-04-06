package codechallenges;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;

public class BusinessTrip {

    public boolean businessTrip(Graph graph, String[] cities) {
        Integer cost = 0;
        for (int i = 0; i < cities.length - 1; i++) {
            Vertex<String> currentVertex = new Vertex<>(cities[i]);
            Vertex<String> nextVertex = new Vertex<>(cities[i+1]);
            Edge testEdge = new Edge(nextVertex);
            if (graph.getNeighbors(currentVertex).contains(testEdge)) {
                return true;
            }
        }
        return false;
    }
}
