import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight){
            this.target = target;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int source) {
        int V = graph.size();

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            for(Edge edge : graph.get(u)){
                int v = edge.target;
                int weight = edge.weight;

                if(dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distance form source " + source + ":");

        for(int i = 0; i < V; i++){
            System.out.println("To vertex " + i + " -> " + dist[i]);
        }
    }


    public static void main(String[] args) {
        
        int v = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for(int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 5));

        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(4, 2));

        graph.get(2).add(new Edge(3, 4));

        graph.get(3).add(new Edge(0, 7));
        graph.get(3).add(new Edge(2, 6));

        graph.get(4).add(new Edge(1, 3));
        graph.get(4).add(new Edge(2, 9));
        graph.get(4).add(new Edge(3, 2));


        dijkstra(graph, 0);
    }
}
