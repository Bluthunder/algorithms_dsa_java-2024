import java.util.ArrayList;

class Graph{

    ArrayList<ArrayList<Integer>> graph;

    int vertex;

    public Graph(int nodes) {
        vertex = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertex;i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u){
        graph.get(v).add(u);
        graph.get(u).add(v);

    }

    void printGraph(){
        for (int i=0;i<vertex;i++){
            System.out.println("Node: " +i);
            for(int x: graph.get(i)){
                System.out.println("-->" + x);
            }
            System.out.println();
        }
    }
}


public class Graphs {
    public static void main(String[] args) {

        System.out.println("Hello world!" + "GRAPH IMPLEMENTATION");

        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(3,2);
        graph.addEdge(2,4);
        graph.addEdge(1,4);
        graph.addEdge(3,1);
        graph.addEdge(2,0);

        graph.printGraph();
    }
}

