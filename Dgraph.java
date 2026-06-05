import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dgraph {
    int vertices;
    private List<List<Integer>> adjList;

    public Dgraph(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for(int i = 0; i < vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int souce, int desti){
        adjList.get(souce).add(desti);
    }

    private void dfsTopo(int curr, boolean[] vis, Stack<Integer> s){
        vis[curr] = true;

        for(int neighbor : adjList.get(curr)){
            if(!vis[neighbor]) {
                dfsTopo(neighbor, vis, s);
            }
        }
        s.add(curr);
    }

    private void topoSort(){
        boolean[] vis = new boolean[vertices];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < vertices; i++){
            if(!vis[i]){
                dfsTopo(i, vis, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.peek() + ", ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        Dgraph d = new Dgraph(6);
        d.addEdge(5, 0);
        d.addEdge(5, 2);
        d.addEdge(4, 0);
        d.addEdge(4, 1);
        d.addEdge(2, 3);
        d.addEdge(3, 1);

        d.topoSort();
    }
}
