import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for(int i = 0; i < vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destication){
        adjList.get(source).add(destication);
        adjList.get(destication).add(source);
    }

    public void printGraph() {
        for(int i = 0; i<vertices; i++){
            System.out.print(i + " -> " );
            for(int neighbor : adjList.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue =new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");

            for(int neighbor : adjList.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(int start){
        boolean[] visited = new boolean[vertices];
        dfsHelper(start, visited);
    }

    private void  dfsHelper(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        for(int neighbor : adjList.get(start)){

            if(!visited[neighbor]){
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);
    
        System.out.println("graph");
        g.printGraph();

        System.out.println("bfs");
        g.bfs(3);

        System.out.println("\ndfs");
        g.dfs(3);


    }
}