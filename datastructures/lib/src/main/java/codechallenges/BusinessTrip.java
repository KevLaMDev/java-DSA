package codechallenges;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;

import java.util.LinkedList;

public class BusinessTrip {

    public Integer businessTrip(Graph graph, String[] cities) {
        Integer cost = 0;
        for (int i = 0; i < cities.length - 1; i++) {
            LinkedList<Edge> adjecencyList = graph.getNeighbors(cities[i]);
            Boolean isNeighbor = false;
            for (int j = 0; j < adjecencyList.size(); j++) {
                if (adjecencyList.get(j).destination.value.equals(cities[i+1])) {
                    cost += adjecencyList.get(j).weight;
                    isNeighbor = true;
                }
            }
            if (!isNeighbor) return null;
        }
        return cost;
    }
}
